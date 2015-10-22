package myCassandraProject;

//import java.net.InetAddress;
//import java.rmi.UnknownHostException;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class SimpleClient {

	private static Cluster cluster;

	static String host = "192.168.1.168";
	private static Session session;

	public void connect(String host) {

		cluster = Cluster.builder().addContactPoint(host).build();
		Metadata metadata = cluster.getMetadata();
		System.out.printf("Connected to cluster: %s\n", metadata.getClusterName());
		session = cluster.connect();
		System.out.println("connected to cluster "+session.getCluster().getClusterName());
	}

	public void close() {
		cluster.close();
		System.out.println("Connection closed");
		// cluster.shutdown();
	}

	public void loadData() {
		session.execute("INSERT INTO test.composite_com_key(c_id,day,time,temp)" + "VALUES ("
				+ "2," + "'19-10-2015'," + "now()," + "92" + ");");
	}

	public void querySchema() {
		
		ResultSet results = session.execute("SELECT * FROM test.composite_com_key "
				+ "WHERE c_id = 2 and day='19-10-2015';");
		if (results != null) {
			System.out.println("results" + results);
			for (Row row : results) {
				System.out.println(row);
			}
		}

	}

	public static void main(String[] args) {
		SimpleClient client = new SimpleClient();
		client.connect(host);

		client.loadData();
		client.querySchema();
		client.close();
	}
}

/*
 * try{ InetAddress host = InetAddress.getByName(host); }
 * catch(UnknownHostException ex){ ex.printStackTrace(); }
 */