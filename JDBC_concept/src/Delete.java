import java.sql.*;

public class Delete {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://localhost/jdbc_connections";
		String userName = "root";
		String passWord = "root";

		try {
			Connection connection = DriverManager.getConnection(connectionString, userName, passWord);
			Statement smt = connection.createStatement();

			String deleteQuery = "DELETE FROM STUDENT WHERE ID = 3";
			int result = smt.executeUpdate(deleteQuery);

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
