package loops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pin=0;
		for(int i=0; i<3; i++){
			System.out.println("Enter your PIN : ");
			pin=scanner.nextInt();
			if(pin==1234) {
				System.out.println("Welcome");
				break;
			}
			else {
				System.out.println("pin is invalid ..");
				if(i==2) {
					System.out.println("your card is blocked..!");
				}
			}
		}
	}

}
