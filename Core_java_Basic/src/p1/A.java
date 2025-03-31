package p1;

import java.security.PrivateKey;

public class A {

	private int x = 10;
	private void test() {
		System.out.println(20);
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.x);
		a1.test();
		
	}

}
