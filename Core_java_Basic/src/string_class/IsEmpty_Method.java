package string_class;

public class IsEmpty_Method {

	public static void main(String[] args) {
		String x1="";
		System.out.println(x1.isEmpty());
		
		System.out.println(x1.length());
		
		String s1 = "mike";
		String s2 ="mike";
		String s3 = "mike";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		
		String s4 = "abc    ";
		String s5 ="acc";
		
		System.out.println(s4.compareTo(s5));
		
		System.out.println(s4.toUpperCase());
		System.out.println(s5.toLowerCase());
		System.out.println(s4.trim());
		
		
	}

}
