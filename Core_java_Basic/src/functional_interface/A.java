package functional_interface;

@FunctionalInterface
public interface A { // error because functional interface only have one unimpliment method inside interface/
	public void test();
	public void test2();
}
