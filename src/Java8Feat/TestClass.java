package Java8Feat;

public class TestClass{
	public static void main(String a[]) {
		TestInterface str = (msg) -> {
			System.out.println(msg);
		};
		str.testme("hello y");
		
	}
}
