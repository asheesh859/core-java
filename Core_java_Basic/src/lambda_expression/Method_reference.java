package lambda_expression;


interface myInterface{
	
	public void m1();
}
public class Method_reference {
	
	
 public static void m2() {
	 System.out.println("Method m2() is running..");
	 
 }
 

	public static void main(String[] args) {
		myInterface mi = () -> System.out.println("hello");
		mi.m1();
		myInterface in = Method_reference::m2;
		in.m1();

	}

}
