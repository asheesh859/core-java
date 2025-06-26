package StreamAPI;

import java.util.List;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;
import java.util.stream.Stream;

class User{
	String name;
	int age;
	public User(String name , int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "User [name = "+name+" , age = "+age+"]";
	}
}
public class UserData {
	public static void main(String[] args) {
		
		User u1 = new User("Ashu", 27);
		User u2 = new User("Abhishek", 30);
		User u3 = new User("Bum bahadur", 32);
		User u4 = new User("Dev", 37);
		User u5 = new User("Mike", 22);
		User u6 = new User("deviv", 23);
		User u7 = new User("Rohn", 28);
		
		
		Stream<User> stream1 = Stream.of(u1,u2,u3,u4,u5,u6,u7);
		Stream<User> stream2 = Stream.of(u1,u2,u3,u4,u5,u6,u7);
		
		stream1.filter(e -> e.age>18).forEach(Name -> System.out.println(Name));
		
		System.out.println("#####################################");
		stream2.filter(_predicate -> _predicate.age>18 && _predicate.name.startsWith("A") ).forEach(users -> System.out.println(users) );
		
	}
}
