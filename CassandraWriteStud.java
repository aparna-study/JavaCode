package myCassandraProject;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.PreparedStatement;

import java.sql.ResultSet;

import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

import myCassandraProject.RdMysqlWtCass;

public class CassandraWriteStud {

	private static Cluster cluster;

	static String host = "192.168.1.168";
	private static Session session;
//	String query = "CREATE TABLE test.studentFromMysql(stID int PRIMARY KEY, " + "stName text, "
//			+ "stAddress text " + " );";
	String query = "CREATE TABLE test.studentFromMysql(stID int, stName text, stAddress text );";
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void connect(String host) {
		cluster = Cluster.builder().addContactPoint(host).build();
		Metadata metadata = cluster.getMetadata();
	    System.out.printf("Connected to cluster: %s\n",metadata.getClusterName());
		session = cluster.connect();
		System.out.println("CONNECTED! "+session.getCluster().getClusterName());
	}

	/*public void createTable() {
		try {
			session.execute(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	public void loadData() {
		RdMysqlWtCass rdtable = new RdMysqlWtCass();
		resultSet = rdtable.readDataBase();
		try {
			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("stId"));
				String name = resultSet.getString("stName");
				String address = resultSet.getString("stAddress");
				
				System.out.println(id+" "+name);

				preparedStatement = session.prepare("insert into  test.studentFromMysql(stid,stname,staddress )  values ( ?, ?, ?)");

				// create the bound statement and initialise it with your
				// prepared statement
				BoundStatement boundStatement = new BoundStatement(preparedStatement);

				session.execute( // this is where the query is executed
				boundStatement.bind(id, name, address));

			}
		} catch (Exception ex) {
		 ex.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CassandraWriteStud cs=new CassandraWriteStud();
		cs.connect(host);
		//cs.createTable();
		cs.loadData();
		
	}

}
