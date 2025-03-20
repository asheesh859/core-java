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
		System.out.println("this "+this);
	}
	
	{
		System.out.println(this);
	}
	
	static {
		//System.out.println(this); //error can not use this in static block 
	}
	

	public static void main(String[] args) {
		UseThisKeyword objKeyword = new UseThisKeyword();
		System.out.println("object " +objKeyword);
			
		UseThisKeyword a1 = new UseThisKeyword();
		a1.test();
		UseThisKeyword a2 = new UseThisKeyword();
		
		a2.test();
		a2.test();
	}
	
	public void test() {
	System.out.println("test method "+this);
	}
	
}




