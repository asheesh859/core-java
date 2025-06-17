package lambda_expression;

import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	public String nameString;
	public String locationString;
	public String dept;

	public Employee(String nameString, String locString, String dept) {
		this.nameString = nameString;
		this.locationString = locString;
		this.dept = dept;
	}

}

public class PredicateLogicalOper {
	public static void main(String[] args) {
		Employee e1 = new Employee("Raja", "Delhi", "Commputer Science");
		Employee e2 = new Employee("Rani", "hyd", "DB");
		Employee e3 = new Employee("Ramu", "", "Commputer Science");
		Employee e4 = new Employee("Ramesh", "hyd", "DB");

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);

		Predicate<Employee> p1 = (e) -> e.locationString.equals("hyd");
		Predicate<Employee> p2 = (e) -> e.dept.equals("DB");

		Predicate<Employee> predicate = p1.and(p2);

		for (Employee e : emps) {
			if (predicate.test(e)) {
				System.out.println(e.nameString);
			}

		}

	}
}
