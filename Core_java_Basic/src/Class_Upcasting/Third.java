package Class_Upcasting;

public class Third extends First{

	@Override
	public void display() {
		System.out.println("this is third class method");
	}
	
	public static void main(String[] args) {
		First first = new Second();
		first.display();
		first=new Third();
		first.display();
	}
	

}
