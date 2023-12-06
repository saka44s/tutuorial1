package Java8Util;

import java.util.Arrays;
import java.util.List;

public class StreamsMap {
	public static void main(String a[]) {
		List<Integer> lst = Arrays.asList(11,2,13,44,53,26);
		
		lst.stream()
		.map(n -> String.valueOf(n))
		.filter(t -> t.startsWith("1"))
		.forEach(System.out::println);
	}
}
