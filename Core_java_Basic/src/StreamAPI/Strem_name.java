package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Strem_name {
public static void main(String[] args) {
	
	List<Integer> list = Arrays.asList(66,32,45,12,30);
	
	list.stream().filter(e -> e>20).forEach( i -> System.out.println(i));
	
	List<String> nameStrings = Arrays.asList("John" , "Ashu" , "Abhishek " , "Anurag" , "Joshi " , "Mike" , "Kirti");
	
	nameStrings.stream().filter(startWithA -> startWithA.startsWith("A")).forEach(name -> System.out.println(name));
	
	
}
}
