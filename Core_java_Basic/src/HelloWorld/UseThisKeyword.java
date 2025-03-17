package HelloWorld;

import java.util.concurrent.ForkJoinPool;

public class UseThisKeyword {
//use this keyword

	int a, b, c;

	UseThisKeyword(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	UseThisKeyword(int a, int b) {

		this(2, 4, 10);
		System.out.println(a);
		System.out.println(b);
	}

	UseThisKeyword() {
		this(10, 70);
	}
	
	public void test(int ...x) {
		for(int i:x) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	UseThisKeyword obj=	new UseThisKeyword();
	obj.test(1,2,3,4,5,6);
		
		
	}

}
