package p2;


import p1.A;

public class C extends A{

	public static void main(String[] args) {
		C c1 = new C();
		System.out.println(c1.x); //can not access private members in different package in different sub-class
		c1.test(); //can not access private members in different package in different sub-class
	}
	
}
