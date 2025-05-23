package string_class;

public class A {

	public static void main(String[] args) {
		String string = "mike";
		String string2= new String("mike");
		if(string==string2) {
			System.out.println("true");
		}else 
		{
			System.out.println("false");
		}
		
		String s1="john"; //store in string pool
		String s2="john"; //store in string pool
		System.out.println(s1==s2); // == compare string object address
		
		
		String string3 = new String("Alice");
		String string4 = new String("Alice");
		
		System.out.println(string3==string4); // compare string object address
		
		String s6 = "mike"; //this string will create in string poll
		String s7 = new String("mike"); //this string will create string object 
		System.out.println(s6==s7);
		
		
		
		
	}
	
	
	
 
	

}
