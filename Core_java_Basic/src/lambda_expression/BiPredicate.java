package lambda_expression;

import java.util.function.Function;

public class BiPredicate {
public static void main(String[] args) {
	Function<String, Integer> function = (name) -> name.length();
	System.out.println(function.apply("Ashu Prajapati"));
	
} 
}
