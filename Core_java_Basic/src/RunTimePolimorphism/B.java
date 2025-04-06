package RunTimePolimorphism;

public class B extends A {
	@Override
	public void dailyCashLimit() { // error return type should be same as parent class method
		System.out.println(50000);
	}

	public static void main(String[] args) {
		A a1 = new A();
		a1.dailyCashLimit();
	}

}
