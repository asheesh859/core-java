package aws_connections_db;
import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://testingdb.cdyu48mcyrfb.ap-south-1.rds.amazonaws.com/jdbc_connections";
		String userName = "root";
		String passWord = "Ashu$12345";

		try {
			Connection connection = DriverManager.getConnection(connectionString, userName, passWord);
			Statement smt = connection.createStatement();

			String deleteQuery = "DELETE FROM student WHERE ID = 3";
			int result = smt.executeUpdate(deleteQuery);

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
