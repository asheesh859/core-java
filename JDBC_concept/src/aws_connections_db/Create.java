package aws_connections_db;
import java.sql.*;

public class Create {

	public static void main(String[] args) {

		try {

			String connectionString = "jdbc:mysql://testingdb.cdyu48mcyrfb.ap-south-1.rds.amazonaws.com/jdbc_connections";
			String userName = "root";
			String passWord = "Ashu$12345";
			Connection connection = DriverManager.getConnection(connectionString, userName, passWord);
			
			Statement smt = connection.createStatement();
			
			String inserQueryString = "INSERT INTO student VALUES (3,'Ashish','ashish122@gmail.com','noida') ,(2,'Anuj' , 'anuj@mail.com', 'Delhi')";
			int result = smt.executeUpdate(inserQueryString);

			System.out.println(result);
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
