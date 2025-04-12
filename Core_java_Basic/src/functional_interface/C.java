package functional_interface;

public class C implements B{

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
		c1.test3();
	}

	@Override
	public void test3() {
		System.out.println("from funtional interface");
		
	}

}
