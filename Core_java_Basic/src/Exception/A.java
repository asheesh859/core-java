package Exception;

public class A {

	
	
	public static void main(String[] args) {
		try {
			int a= 10;
			int y = 0;
			int z = a/y; // Stop the program when exception is occur 
			System.out.println(100);
		}catch(Exception error) {
			System.out.println(error.getMessage());
		}
		System.out.println("Welcome");
	}

}
