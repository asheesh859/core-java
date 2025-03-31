package p1;

import p2.C1;

public class B extends C1{

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.x); //can not access private members 
		b1.test();
	}
	


}


