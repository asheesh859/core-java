package downcasting;

public class C extends A{
	
	public static void main(String[] args) {
		A a1 = new B();// upCasting
		a1.dsplayA();
		((B)a1).displayB(); //DownCasting
	}
}
