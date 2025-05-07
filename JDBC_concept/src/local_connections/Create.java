package local_connections;
import java.sql.*;

public class Create {

	public static void main(String[] args) {

		try {

			String connectionString = "jdbc:mysql://127.0.0.1:3306/jdbc_connections";
			String userName = "root";
			String passWord = "root";
			Connection connection = DriverManager.getConnection(connectionString, userName, passWord);
			
			Statement smt = connection.createStatement();
			
			String inserQueryString = "INSERT INTO STUDENT VALUES (3,'Ashish','ashish122@gmail.com','noida') ,(2,'Anuj' , 'anuj@mail.com', 'Delhi')";
			int result = smt.executeUpdate(inserQueryString);

			System.out.println(result);
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
