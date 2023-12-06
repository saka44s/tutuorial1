package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashsetClass {
	public static void main(String a[]) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add(null);
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.add(null);
	    System.out.println(cars);
	
	    Set<String> st = new HashSet<String>();
	    
	    List<String> ls = new ArrayList<String>();
	    ls.add("mist");
	    ls.add("rest");
	    ls.add("pest");
	    ls.add("best");
	    ls.add("best");
	    ls.add(null);
	    
	    System.out.println(ls);
	}
}
