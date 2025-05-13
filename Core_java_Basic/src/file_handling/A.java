package file_handling;

import java.io.File;

public class A {

	public static void main(String[] args) {
		try {
			File file = new File("C:\\bin\\test.txt");
			System.out.println(file);
			System.out.println(file.exists());	
		} catch (Exception e) {
			// TODO: handle exception
		
		
		}
}
