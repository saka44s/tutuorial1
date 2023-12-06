package Java8Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamBasicSort {
	
	public static void main(String a[]) {
		List<Integer> lst = Arrays.asList(2,82,34,33,4,45,5,6,67,7,8);
		
		lst.stream()
		.sorted()
		.forEach(System.out::print);
		
		System.out.println();
		
		lst.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::print);
		
	}
	

}
