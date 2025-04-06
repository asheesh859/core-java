package RunTimePolimorphism;

public class Sub {

	@Override
	protected void dailyCashLimit() {// access modifire should be increase accessibility not decrease modifire
		System.out.println("50000");
	}

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.dailyCashLimit();
	}
}
