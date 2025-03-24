package HelloWorld;

class constructorChaining {
	
//	 constructorChaining() {
//		System.out.println("this is constructor");
//	}
//	 
//	 constructorChaining(int x){
//		 this();
//	 }
	 
	 
	 constructorChaining() {
		System.out.println("A");
	}
	 
	 constructorChaining(int x){
		constructorChaining a = new constructorChaining();
	 }
	public static void main(String[] args) {
		new constructorChaining(100);

	}

}
