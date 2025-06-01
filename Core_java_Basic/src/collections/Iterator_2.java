package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_2 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Banana");
		arrayList.add("Mango");
		arrayList.add("Charry");
		arrayList.add("papaya");
		Iterator<String> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			String valueString = itr.next();
			System.out.println(valueString);			
		}
	}

}
