package defalut_interface;

public interface A {
	default public void test() {
		System.out.println("from interface test method");
	}
	default public void test2() {
		System.out.println("from interface default method test2");
	}
	
	public void test3();
}
