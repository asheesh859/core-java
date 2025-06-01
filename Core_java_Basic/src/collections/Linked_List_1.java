package collections;
import java.util.*;

public class Linked_List_1 {

	public static void main(String[] args) {
		var value = new LinkedList<String>();
		value.add("Banana");
		value.add("Papaya");
		value.add("Blackberry");
		
		for(int i =0; i<value.size(); i++) {
			System.out.println(value.get(i));
		}
		
		for(String string : value) {
			System.out.println(string);
		}
		
		System.out.println(value.getFirst());
		System.out.println(value.getLast());
		System.out.println(value.get(2));
		
		value.add(0, "pineapple");
		System.out.println(value);
		System.out.println(value.remove(1));
		System.out.println(value);
	}
}
