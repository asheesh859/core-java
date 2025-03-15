package HelloWorld;


public class ReturnKeyword {

	public static void main(String[] args) {
		ReturnKeyword obj = new ReturnKeyword();
		int num = obj.test();
		String nameString = obj.test1();
		System.out.println("function return number "+num);
		System.out.println("Function retrun String : "+nameString);
		
		int sum = obj.sum(10, 15);
		System.out.println("function return 2 digit sum : "+sum);
		
		obj.printArguments(10,50,"Ashu");
		obj.display(5, 3.88, "john", 'a');
	}

	public int test() {
		return 100;
	}

	public String test1() {
		return "Ashu";
	}
	
	//function with argument
	public int sum(int a , int b) {
		
		return a+b;
		
	}
	public void printArguments(int a , int b , String name) {
		System.out.println("value of a : "+a );
		System.out.println("value of b : "+b );
		System.out.println("value of name : "+name );
		
		
	}
	
	public void display(int a , double b , String name , char c) {
		System.out.println("value of a : "+a );
		System.out.println("value of b : "+b );
		System.out.println("value of name : "+name );
		System.out.println("value of char : "+c );
	}

}
