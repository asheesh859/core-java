package lambda_expression;

public class B {

	public static void main(String[] args) {
		A a=()->{
			System.out.println("From interface");
			
		};
		
		a.test();
	}

}
