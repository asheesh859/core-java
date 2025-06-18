package lambda_expression;

import java.util.function.Supplier;

class Doctor{
	public Doctor() {
		System.out.println("Doctor Constructor..");
	}
	
}
public class Supplier_class {

	public static void main(String[] args) {
		Supplier<Doctor> supplier = Doctor::new;
		System.out.println(supplier.get().hashCode());
	}
	
}
