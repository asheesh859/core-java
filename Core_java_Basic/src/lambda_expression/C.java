package lambda_expression;
import java.util.ArrayList;
public class C {

	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(10);
		number.add(20);
		number.add(22);
		number.add(27);
		number.add(30);

		number.forEach((e) -> {
			if (e % 2 == 0) {
				System.out.println("even " + e);
			} else {
				System.out.println("odd " + e);
			}
		});
	}

}
