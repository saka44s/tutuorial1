package Java8Feat;

@FunctionalInterface
public interface TestInterface {
	//public void testme();
	public void testme(String str);
	public default void pingMe() {
		System.out.println("hello");
	}
	
	public static void testStaticMe() {
		System.out.println("static");
	}
	
}
