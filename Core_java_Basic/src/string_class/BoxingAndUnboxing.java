package string_class;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		Integer numInteger = 10;
		Character character = 'A';
		Float float1 = 10.0f;
		Double double1 = 10.2;
		Boolean boolean1 = true;
		
		Integer numInteger2 = Integer.valueOf(numInteger);
		System.out.println(numInteger2);
		
		Character character2 = Character.valueOf(character);
		System.out.println(character2);
		
		float f = Float.valueOf(float1);
		
		System.out.println(f);
	}

}
