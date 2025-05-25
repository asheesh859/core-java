package string_class;

public class ConcatMethod {

	public static void main(String[] args) {
		String string = "Hello";
		String string2="world";
		
		System.out.println(string.concat(string2));
		System.out.println(string.concat(" ").concat(string2));
	}

}
