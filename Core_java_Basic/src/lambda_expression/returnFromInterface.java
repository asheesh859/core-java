package lambda_expression;

public class returnFromInterface {

	public static void main(String[] args) {

		return_interface r1 = (int x, int y) -> {
			return x+y;
		};
		
		int sum = r1.test(200, 100);
		System.out.println(sum);
	}

}
