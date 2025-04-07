package interfaces;

public class B extends A implements Interface_C{

	@Override
	public void test_C() {
		System.out.println("Method of Interface C");
		
	}

	@Override
	public void test_D() {
		System.out.println("Method of Interface C");
		
	}
	public static void main(String[] args) {
		B b = new B();
		b.test_1();
		b.test_2();
		b.test_A();
		b.test_B();
		b.test_C();
		b.test_D();
		

	}
	
	

}
