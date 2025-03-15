package HelloWorld;


public class StaticKeyword {
	static int x = 100; // Static variable
	static int z;
	int b = 200;
	public static void test() {
		System.out.println("This is static method");
		System.out.println("This is static variable : "+ x);
		System.out.println("This is static variable without initilization : "+ z);
		
	}
	
	public void local() {
		int y = 200;
		System.out.println("This is local variable "+y);
		System.out.println("This is static variable : "+ StaticKeyword.x);
		System.out.println("This is static variable without initilization : "+StaticKeyword.z);
	}
	public static void main(String[] args) {
		
	//	System.out.println("This is local variable "+y); //Error for accessing local variable
		System.out.println("This is static variable in main : "+ StaticKeyword.x);
		System.out.println("This is static variable without initilization in main : "+StaticKeyword.z);
		StaticKeyword obj = new StaticKeyword();
		
		
		obj.local();
		StaticKeyword.test();
		
		System.out.println("This is non static variable in main : "+ obj.b);

	}

}
