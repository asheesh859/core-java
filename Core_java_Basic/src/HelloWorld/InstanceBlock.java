package HelloWorld;

public class InstanceBlock {
	
	{
		System.out.println("instance block called");
	}
	{
		System.out.println("instance block 2nd");
	}
	
	InstanceBlock() {
		System.out.println("constructor called");
	}
	public static void main(String[] args) {
		new InstanceBlock();
		System.out.println("main called");
		
	}
}
