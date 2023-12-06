package Java8Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class dupliAndNot {
	public static void main(String a[]) {
		List<Integer> lst = Arrays.asList(2,3,4,5,5,6,7,7,8);
		List<Integer> uniqueList = lst.stream().distinct().collect(Collectors.toList());
		List<Integer> duplicates = 
				lst.stream()
		    .filter(v -> Collections.frequency(lst, v) > 1)
		    .distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList);
		System.out.println(duplicates);
		
		
		
		lst.stream().filter(i -> Collections.frequency(lst, i) >1)
        .collect(Collectors.toSet()).forEach(System.out::println);
	}
}
