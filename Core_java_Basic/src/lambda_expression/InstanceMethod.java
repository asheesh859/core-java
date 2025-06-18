package lambda_expression;

public class InstanceMethod {
	
	public void m1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		InstanceMethod im = new InstanceMethod();
		
		Runnable runnable = im::m1;
		Thread thread = new Thread(runnable);
		thread.start();
 	}
}
