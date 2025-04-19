package Class_Upcasting;

public class C extends A{

	public static void main(String[] args) {
		A a1 = new B();
		
		System.out.println(a1); // B class address store
		a1= new C();
		System.out.println(a1); // c class address store 
		
	}
}
