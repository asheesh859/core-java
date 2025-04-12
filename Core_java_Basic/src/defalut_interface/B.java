package defalut_interface;

public class B implements A {
	
	public static void main(String[] args) {
		B b1= new B();
		b1.test();
		b1.test2();
		b1.test3();
	}

	@Override
	public void test3() {
		System.out.println("unmlipment to impliment method in class implement from interface");
		
	}

}
