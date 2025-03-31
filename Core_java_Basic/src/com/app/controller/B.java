package com.app.controller;

import static com.app.entity.A.a;
import static com.app.entity.A.test;

import com.app.entity.A;

public class B {

	public static void main(String[] args) {
		A a1 = new A();
		com.app.service.A a2 = new com.app.service.A();
		System.out.println(a1.a);
		a1.test();
		
		test();
		System.out.println(a);
	}

}
