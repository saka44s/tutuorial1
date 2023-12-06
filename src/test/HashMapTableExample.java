package test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTableExample {

	public static void main(String a[]) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Sasi");
		hmap.put(2,  "Messi");
		hmap.put(null,  null);
		hmap.put(null,  "rest");
		
		//multiple null keys not throwing any error
		hmap.forEach((k,v)->System.out.println(k+"--"+v));
		
		for (Entry<Integer, String> entry : hmap.entrySet()) {
		    Integer key = entry.getKey();
		    String value = entry.getValue();
		}
		
		Hashtable<Integer,String> htable = new Hashtable<Integer,String>();
		htable.put(1, "Sasi");
		htable.put(2,  "Messi");
		
		//Null key or value is not allowed in hashtable
		//htable.put(null, null);
		
		htable.forEach((k,v)->System.out.println(k+"--"+v));
	}
}
