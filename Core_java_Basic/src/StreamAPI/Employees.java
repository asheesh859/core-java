package StreamAPI;

import java.util.stream.Stream;
class Employee{
	String name;
	int age;
	double salary;
	
	
	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class Employees {
	public static void main(String[] args) {
		Employee e1 = new Employee("Asheesh" , 24 , 270000);
		Employee e2 = new Employee("Amit", 30, 30000);
		Employee e3 = new Employee("Rohit", 20, 12000);
		Employee e4 = new Employee("Hanshika", 27, 75000);
		
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4);
		
		stream.filter(e -> e.salary>=50000).map(f -> f.name +"-"+  f.age).forEach(e -> System.out.println(e));
	}

}
