package Java8Feat;

import java.util.function.BiConsumer;

public class Test3Exception {
	public static void main(String a[]) {
		
		int[] array1 = {1,2,3,4};
		int key = 0;
		
		process(array1, key, wrapperLam((v,k)->System.out.println(v/k)));
	}
	
	private static BiConsumer<Integer, Integer> wrapperLam(BiConsumer<Integer, Integer> consumer) {
		return(v,k)->{
			try {
				consumer.accept(v, k);				
			}catch (Exception e) {
				System.out.println(e);
			}
		};
	}

	private static void process(int[] array1, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: array1) {
			consumer.accept(i, key);
		}
	}
}
