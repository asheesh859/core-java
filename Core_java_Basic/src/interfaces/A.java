package interfaces;

public class A implements InterFace_A , Interface_B{
	@Override
	public void test_A() {
		System.out.println("Method of Interface B");
	}
	@Override
	public void test_B() {
		System.out.println("Method of Interface B");
	}

	public static void main(String[] args) {
		A a = new A();
		
		a.test_1();
		a.test_2();
		a.test_A();
		a.test_B();
	}

	@Override
	public void test_1() {
		System.out.println("Method of Interface A");
		
	}

	@Override
	public void test_2() {
		System.out.println("Method of Interface A");
		
	}
}
