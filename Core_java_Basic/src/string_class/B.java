package string_class;

public class B {

public static void main(String[] args) {
		String s1 = "mike";
		String s2 = new String("mike").intern(); //this method not create object of the string it point string poll expicitlly
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
