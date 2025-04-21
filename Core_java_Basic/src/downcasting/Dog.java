package downcasting;

public class Dog extends Animal{

	public void walk() {
		System.out.println("Dog walking..");
	}

	public static void main(String[] args) {
		Dog dog = (Dog) new Animal();	
		
	}
	
	
}
