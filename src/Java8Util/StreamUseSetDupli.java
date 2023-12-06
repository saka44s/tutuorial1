package Java8Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamUseSetDupli {
	public static void main(String a[]) {
		List<Integer> lst = Arrays.asList(2,3,4,5,5,6,7,7,8);
		Set<Integer> st = new HashSet();
		lst.stream()
		.filter(n -> st.add(n))
		.count();
		
		//st.forEach(System.out::println);
		
		
		//Best approach
		/*
		Set<Integer> st = lst.stream()
		.collect(Collectors.toSet());
		
		st.forEach(System.out::println);
		*/
		System.out.println("--------");		
		lst.stream().findFirst().ifPresent(System.out::println);
		System.out.println("--------");
		Long count = lst.stream().count();
		System.out.println(count);
		
		
		int max = lst.stream()
		.max(Integer::compare)
		.get();
		
		Set<Integer> set = lst.stream()
				.sorted().collect(Collectors.toSet());
		
		Set<Integer> set1 = lst.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
		
		Optional<Integer> secondHigh = lst.stream()
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();
		
		
		System.out.println(set);
		
		System.out.println(set1);
		
		System.out.println(max);
		
		System.out.println(secondHigh);
		
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int result = numbers
		  .stream()
		  .reduce(0, (subtotal, element) -> subtotal + element);
		
		int result1 = numbers.stream().reduce(0, Integer::sum);
		

		lst.stream().mapToInt(i-> i).average().ifPresent(avg -> System.out.println(avg));
		
		
		
	}
}
