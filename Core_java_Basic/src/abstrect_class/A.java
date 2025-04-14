package abstrect_class;

import HelloWorld.StaticBlock;

public abstract class A {

	int x =10;
	static int y = 20;
	public static void test() {
		System.out.println(200);
	}
	abstract static public void test3(); // error can not define static abstract method
	abstract public void test2();

}
