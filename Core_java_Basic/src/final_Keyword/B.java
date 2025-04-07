package final_Keyword;

final public class B extends A{

	public void test() {
		System.out.println("test method");
	}
	
	@Override
	public void test2() { //final test method can not be override
		System.out.println("final method can not be inharite or override");
	}
	public static void main(String[] args) {
		B b = new B();
		b.test();
		System.out.println(b.x);
		System.out.println(b.y);
	}
}
