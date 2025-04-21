package downcasting;

public class C extends A{
	
	public static void main(String[] args) {
		A a1 = new B();
		if(a1 instanceof B) {
			
			B b1 = (B) a1;
			System.out.println("DownCasting Succesfull.");
		}
	}

	

}
