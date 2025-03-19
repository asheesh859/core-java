package HelloWorld;

public class InstanceAndStatic {
	public static void test() {
		System.out.println("Static method called");
		
		
	}
	{
		System.out.println("instance block called");
	}
	static {
		System.out.println("static block called");
		InstanceAndStatic objAndStatic = new InstanceAndStatic();
		objAndStatic.test2();
		
	}
	 InstanceAndStatic() {
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		System.out.println("main called");

	}
	public void test2() {
		System.out.println("test method called");
		InstanceAndStatic.test();
	}

}
