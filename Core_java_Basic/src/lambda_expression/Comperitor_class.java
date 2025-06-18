package lambda_expression;
import java.util.ArrayList;
import java.util.Collections;

public class Comperitor_class {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(5);
		arrayList.add(70);
		arrayList.add(30);
		arrayList.add(2);
		
		Collections.sort(arrayList , (i, j )-> (i > j) ? -1:1  );
		
		System.out.println(arrayList);
		
	}
}
