package downcasting;

public class MainClass {
	
	public static void instanceOf(Class_A obj) {
			if(obj instanceof Class_B) {
				Class_B b = (Class_B) obj;
				b.showB();
			}else if (obj instanceof Class_C) {
				Class_C c = (Class_C) obj;
				c.showC();
				
			}else {
				obj.showA();
			}
			
	}

	public static void main(String[] args) {
		instanceOf(new Class_A());
		instanceOf(new Class_B());
		instanceOf(new Class_C());
		
	}
}
