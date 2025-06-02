package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {
	public static void main(String[] args) {
		 Set<String> set = new HashSet<>();
		   set.add("India");
		   set.add("USA");
		   set.add("UK");
		   set.add("China");
		   set.add("India");
		   
		   System.out.println(set);
		   
		   Set<String> set_2 = new TreeSet<>();
		   set_2.add("Delhi");
		   set_2.add("Punjab");
		   set_2.add("Agra");
		   
		   set.addAll(set_2);
		   
		 boolean result = set.contains("Agra");
		   
		   Set<String> s3 = new TreeSet<>(set);
		   
		   boolean containsSet = set.containsAll(s3);
		   System.out.println(containsSet);
		   
		   Set<String> emptySet = new HashSet<>();
		   
		   boolean isEmptySet = emptySet.isEmpty();
		   
		   System.out.println("check empty set : "+isEmptySet);
		   
		   int hash= s3.hashCode();
		   System.out.println(hash);
		   
		   System.out.println(s3);
		   
		   System.out.println(set);
		   
		   System.out.println(result);
		   
		   
		   Iterator itr = set.iterator();
		   
		   while(itr.hasNext()){
		       System.out.println("Set : "+itr.next());
		       
		   }
		   
		   System.out.println(s3.size());
		   
		   
		  s3.retainAll(set_2);
		  
		  System.out.println("After retainAll : "+s3);
		  
		  
		  set.remove("India");
		  System.out.println(set);
		   System.out.println("before removeAll "+ set);
		  set.removeAll(set_2);
		  System.out.println("After removeAll "+ set);
		   
		   set.clear();
		   
		   System.out.println("After clear : "+ set);
		
	}
}
