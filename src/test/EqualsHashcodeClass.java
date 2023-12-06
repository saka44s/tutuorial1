package test;

public class EqualsHashcodeClass {
	public static void main(String a[]) {
		Employee e1 = test1.getEmployees().get(3);
		Employee e2 = test1.getEmployees().get(4);
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.getName()+"--"+e2.getName());
		System.out.println(e1.hashCode()+" == "+e2.hashCode());
				
	}
	
}
