package local_connections;

import java.beans.Statement.*;
import java.sql.Connection;
import java.sql.*;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the ID : ");
		int id = scanner.nextInt();
		System.out.println("Enter name : ");
		String name = scanner.next();
		System.out.println("Enter email: ");
		String email = scanner.next();
		
		System.out.println("Enter your city : ");
		String city = scanner.next();		
		
		try {
			String connectioString = "jdbc:mysql://127.0.0.1:3306/jdbc_connections";
			String userName = "root";
			String password = "root";
			
			Connection connection = DriverManager.getConnection(connectioString,userName,password);
			 
			
			Statement smt = connection.createStatement();
			String queryString = "INSERT INTO STUDENT VALUES ("+id+",'"+name+"','"+email+"','"+city+"')";
			
			int result = smt.executeUpdate(queryString);
			
			System.out.println(result);
			
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
