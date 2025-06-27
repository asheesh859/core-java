package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatanMap {

	public static void main(String[] args) {
		List<String> subjectList = Arrays.asList("Java" , "JavaScript" , "Computer Network" , "Database Management System" , "hibernet" , "Angular");
		
		List<String> frontEnd = Arrays.asList("React" , "HTML" , "Tailwind_css" , "Bootstrap",  "typeScript");
		
		List<List<String>> courseList = Arrays.asList(subjectList , frontEnd);
		Stream<String> flatMapStream  = courseList.stream().flatMap(e -> e.stream());
		flatMapStream.forEach(c -> System.out.println(c));
	}
}
