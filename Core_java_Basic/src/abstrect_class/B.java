package abstrect_class;

public class B extends A{

	public static void main(String[] args) {
		
		A.test();
		B b1 = new B();
		b1.test2();
		System.out.println(b1.x);
		System.out.println(A.y);
		
		A a1 = new A();//error can not create abstract class method
	}

	@Override
	public void test2() {
		System.out.println(100);
		
	}

}
