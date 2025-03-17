package HelloWorld;

public class constructor {
	//constructor overloading
	constructor(){ // without argument 
		System.out.println("this constructor without argument");
	}
	
	constructor(int a, int b ){ // with argument
		System.out.println(a);
		System.out.println(b);
	}
	constructor(int x){
		System.out.println(x);
	}
	constructor(String x){
		System.out.println(x);
	}
	
	constructor(float a , int b){
		System.out.println(a);
		System.out.println(b);
		
	}
	

	public static void main(String[] args) {
		 new constructor();
		 new constructor(10,20);
		 new constructor(50);
		 new constructor(19,19);
		 new constructor("John");
		

	}//this is git message

}


