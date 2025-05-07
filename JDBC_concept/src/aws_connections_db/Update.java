package aws_connections_db;
import java.sql.*;

public class Update {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://testingdb.cdyu48mcyrfb.ap-south-1.rds.amazonaws.com/jdbc_connections";
		String userNameString = "root";
		String passWordString = "Ashu$12345";
		try {
			Connection connection = DriverManager.getConnection(connectionString, userNameString, passWordString);
			Statement smt = connection.createStatement();
			String queryString = "UPDATE student SET EMAIL='anuj1234@gmail.com' where id =2";
			
			int result = smt.executeUpdate(queryString);
			System.out.println(result);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
