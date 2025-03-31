package p2;

import p1.A;

public class C1 {
	public static void main(String[] args) {
		A a1= new A();
		System.out.println(a1.x); //can not access private members in different package in different non sub-class
		a1.test(); //can not access private members in different package in different non sub-class
	}

}
