import java.sql.*;

public class Update {

	public static void main(String[] args) {
		String connectionString = "jdbc:mysql://127.0.0.1:3306/jdbc_connections";
		String userNameString = "root";
		String passWordString = "root";
		try {
			Connection connection = DriverManager.getConnection(connectionString, userNameString, passWordString);
			Statement smt = connection.createStatement();
			String queryString = "UPDATE STUDENT SET EMAIL='anuj1234@gmail.com' where id =2";
			
			int result = smt.executeUpdate(queryString);
			System.out.println(result);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
