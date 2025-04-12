package functional_interface;

@FunctionalInterface
public interface B {
	default public void test1() {
		System.out.println("default method from interface");
	}
	default public void test2() {
		System.out.println("default method from interface");
	}
	
	public void test3();

}
