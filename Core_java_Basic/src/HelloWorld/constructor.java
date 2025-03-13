package HelloWorld;

public class constructor {
	
	constructor(){ // without argument 
		System.out.println("this constructor without argument");
	}
	
	constructor(int a, int b ){ // with argument
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		 new constructor();
		 new constructor(10,20);
		

	}

}
