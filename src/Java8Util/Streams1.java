package Java8Util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams1 {
	public static void main(String a[]) {
		int [] ar =  {1,2,3,4,5};
		IntStream str = Arrays.stream(ar);

		
		List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8);
		
		str.filter(n -> n%2 == 0)
		.forEach(System.out::println);
		
		lst.stream()
		.filter(n -> n%2 == 0 )
		.forEach(System.out::println);
		
	}
}
