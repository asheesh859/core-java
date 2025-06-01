package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class ArrayList_1 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("USA");
		arrayList.add("India");
		arrayList.add("Germany");
	
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		arrayList.add(2,"Slovakia");
		
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		arrayList.set(2, "UAE");
		
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.get(1));
		
		
		for(String countryString : arrayList) {
			System.out.println("Country : " +countryString);
		}
		
		
	}

}
