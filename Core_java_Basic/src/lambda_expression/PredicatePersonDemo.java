package lambda_expression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	
	String name;
	int age;
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
}
public class PredicatePersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Mike", 26);
		Person p2 = new Person("John", 36);
		Person p3 = new Person("Alice", 18);
		Person p4 = new Person("Ashu", 25);
		Person p5 = new Person("Dev", 16);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		Predicate<Person> predicate = p -> p.age >=18;
		
		for(Person person : persons) {
			if(predicate.test(person)) {
				System.out.println(person.name);
			}
		}
	}
	
}
