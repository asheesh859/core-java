package Exception;

public class ArithmeticExce {

	public static void main(String[] args) {
		
		try {
			int x =10;
			int y=0;
			int z=x/y;
			System.out.println(z);
			System.out.println("welcome");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
	}

}
