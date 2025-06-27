package StreamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Person{
	String name;
	String country;
	
	public Person(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
}

public class Person_Class {

	public static void main(String[] args) {
		Person p1 = new Person("Ashu", "India");
		Person p2 = new Person("Akash", "India");
		Person p3 = new Person("Rohn", "Poland");
		Person p4 = new Person("Mike","UK");
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		boolean status = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println(status);
		boolean match = persons.stream().allMatch(p -> p.country.equals("India"));
		System.out.println(match);
		
		Optional<Person> findFirst = persons.stream().filter(p -> p.country.equals("India")).findFirst();
		if(findFirst.isPresent()) {
			Person person = findFirst.get();
			System.out.print(person.name);
			System.out.println(person.country);
		}
	}
}
