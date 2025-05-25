package wraperStringClass;

public class ContainMethod {

	public static void main(String[] args) {
		String string = "Hello world welcome";
		System.out.println(string.contains("Hello"));
		
		System.out.println(string.indexOf("world"));
		
		System.out.println(string.indexOf('w' , 7));
	}

}
