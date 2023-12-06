package Java8Feat;

import java.util.function.BiConsumer;

public class Test2Exception {
	public static void main(String a[]) {
		
		int[] array1 = {1,2,3,4};
		int key = 2;
		
		process(array1, key, (v,k)->System.out.println(v/k));
	}
	
	private static void process(int[] array1, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: array1) {
			consumer.accept(i, key);
		}
	}
}
