package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SlicingOperation {
	public static void main(String[] args) {
		
		List<String> courseList = Arrays.asList("core-java" , "Hibernet" ,"Hibernet" ,"react" , "angular" , "python" ,"Spring-Boot");
	
		courseList.stream().distinct().forEach(e -> System.out.println(e));
		courseList.stream().limit(3).forEach(c -> System.out.println(c));
		System.out.println("*****************");
		courseList.stream().skip(2).forEach(c->System.out.println(c));
	}
}
