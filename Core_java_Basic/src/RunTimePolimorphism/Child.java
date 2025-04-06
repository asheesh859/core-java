package RunTimePolimorphism;

public class Child extends Parent{
	@Override
	public void test() {
		System.out.println("child class test method"); 
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.test();
		
		Parent parent = new Parent();
		parent.test();
		
	}

}
