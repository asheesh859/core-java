package wraperStringClass;

import javax.lang.model.element.NestingKind;

public class JoinMethod {

	public static void main(String[] args) {
		String[] string= {"Hello" ,"world", "where", "are", "you "};
		String str = String.join("_ ",string);
		System.out.println(str);
		
		// replace method
		
		String string2 = "Hello World";
		String string3 = string2.replace("World", "Java");
		System.out.println(string3);
	}

}
