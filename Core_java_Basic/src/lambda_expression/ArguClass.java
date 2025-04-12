package lambda_expression;

public class ArguClass {

	public static void main(String[] args) {
		
		Argu_interface a1 = (int x , int y) -> {
			System.out.println("value of x : "+x);
			System.out.println("value of y : "+y);
		};
		
		a1.test(100, 200);
	}

}
