package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class MappingOprations {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("India" , "Uk" ,"Japan" ,"China" , "Nepal" , "Slovakia" ,"Hangry" , "Jermany");
		
		list.stream().map(name -> name.toUpperCase()).forEach(country -> System.out.println(country));
		
		System.out.println("*******************");
		list.stream().filter(name -> name.startsWith("J")).forEach(country -> System.out.println(country));
		
		System.out.println("********************");
		list.stream().mapToInt(name -> name.length()).forEach(county -> System.out.println(county));
		
		System.out.println("********************");
		list.stream().filter(p -> p.startsWith("J")).map(f -> f +"-"+ f.length()).forEach(country -> System.out.println(country));
	}

}