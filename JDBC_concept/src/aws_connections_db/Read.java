package aws_connections_db;

import java.sql.*;

public class Read {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://testingdb.cdyu48mcyrfb.ap-south-1.rds.amazonaws.com/jdbc_connections";
		String userName = "root";
		String passWord = "Ashu$12345";

		try {
			Connection connection = DriverManager.getConnection(connectionString, userName, passWord);
			Statement smt = connection.createStatement();

			String ReadQuery = "SELECT * FROM student";

			ResultSet resultSet = smt.executeQuery(ReadQuery);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
