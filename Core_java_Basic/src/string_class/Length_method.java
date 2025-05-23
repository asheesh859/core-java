package string_class;

public class Length_method {

	public static void main(String[] args) {
		String s1 = "mike";
		String s2 = "";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		String s3 = null;
		System.out.println(s3); // if you use s3.length() null pointer exception will occur
		
	}

}
