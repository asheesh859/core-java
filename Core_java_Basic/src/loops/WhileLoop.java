package loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cdn = "yes";
		while (cdn.equals("yes")) {
			System.out.println("Enter your amount: ");
			int amount = scanner.nextInt();
			System.out.println("your amount is : "+amount);
			
			System.out.println("Do you want to contineu yes/no ? ");
			cdn=scanner.next();
			
			
		}
	}

	
	
	

}
