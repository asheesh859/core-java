package collections;



public class Genrics_B{

	public static void main(String[] args) {
		Genrics<String, Integer> obj= new Genrics<String, Integer>("Mike" , 101);
		String nameString = obj.getName();
		int id = obj.getId();
		System.out.println(nameString);
		System.out.println(id);
		
	}
}
