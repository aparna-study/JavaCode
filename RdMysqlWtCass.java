package myCassandraProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.datastax.driver.core.Cluster;

public class RdMysqlWtCass {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private String mysqldbhost = "192.168.1.167";
	private String mysqluser = "cassandra";
	private String myURL = "jdbc:mysql://" + mysqldbhost + "/studentInfo";

	public ResultSet readDataBase() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connect = DriverManager.getConnection(myURL, mysqluser, mysqluser);
			// + "user="+mysqluser+"&password="+mysqluser);
			System.out.println("jdbc:mysql://" + mysqldbhost + "/studentInfo?" + "user="
					+ mysqluser + "&password=" + mysqluser);

			//System.out.println("connect" + connect);
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from studentInfo.studentDetail");
			//System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
		//	writeResultSet(resultSet);
			close();
		} catch (Exception ex) {
			System.out.println(ex);
				}

		return resultSet;

	}

	private void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			int id = Integer.parseInt(resultSet.getString("stId"));
			String name = resultSet.getString("stName");
			String address = resultSet.getString("stAddress");

			//System.out.println("Summery: " + id);
			//System.out.println("name: " + name);
			//System.out.println("address: " + address);
		}
	}

	private void close() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		RdMysqlWtCass dao = new RdMysqlWtCass();
		dao.readDataBase();
		//System.out.println("hi" + dao.readDataBase());
	}

}
