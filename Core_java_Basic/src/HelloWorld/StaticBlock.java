package HelloWorld;

public class StaticBlock {

	static {
		System.out.println("static block called");
	}
	
	static {
		System.out.println("static block 2nd");
	}
	
	StaticBlock() {
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		
		System.out.println("Main called");
		new StaticBlock();
		

	}

}
