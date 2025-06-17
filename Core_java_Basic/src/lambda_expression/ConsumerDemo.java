package lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
	Consumer <String> consumer =(name)-> System.out.println(name);
	
	consumer.accept("Asheesh kumar");
	consumer.accept("Saloni paliwal");
	
	List<Integer> number  = Arrays.asList(20,30,40,50,60);
	number.forEach( i -> System.out.println(i));
	}
}
