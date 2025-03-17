package HelloWorld;

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

	public static void main(String[] args) {
		new UseThisKeyword();
	}

}
