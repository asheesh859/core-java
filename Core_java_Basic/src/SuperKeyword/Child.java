package SuperKeyword;


public class Child extends Parent {
	public Child() {
		super(100);
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.testing();
		
		
	}
	public void testing() {
		System.out.println("parent class value :"+super.x);
		super.test();
	}

}
