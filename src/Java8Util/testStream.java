package Java8Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class testStream {
	public static void main(String a[]) {
		List<String> emps = Arrays.asList("emp1","emplo2","employee3","emp4","emp4","emp1","emply");
		
		
		//Get distinct
		List<String> lst = emps.stream()
		.distinct()
		.collect(Collectors.toList());
		
		System.out.println(lst);
		
		//get emp with length of 
		lst = emps.stream()
				.filter(p -> p.length()==5)
				.collect(Collectors.toList());
		
		System.out.println(lst);
		
//		lst.stream().filter(i -> Collections.frequency(lst, i) >1)
//        .collect(Collectors.toSet()).forEach(System.out::println);
		
		//get duplicate emp
		Set<String> lst1 = emps.stream()
				.filter(p -> Collections.frequency(emps, p) > 1)
				.collect(Collectors.toSet());
		
		System.out.println(lst1);
		
		// using map
		lst = emps.stream()
		.map( p -> p.concat(" test"))
		.collect(Collectors.toList());
		
		System.out.println(lst);
		
		
		// using max
		
	}
}
