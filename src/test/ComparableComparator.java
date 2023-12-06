package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
	public static void main(String a[]) {
		
		
		//Logic with comparable .. employee extends comparable compareTo
		//and sorted line13
		List<Employee> ls = test1.getEmployees();
		Collections.sort(ls);
		ls.stream().forEach(e->System.out.println(e.getEmpId()));
		
		
		//Logic with comparator, compareTo
		Comparator<Employee> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
        
		
		List<Employee> ls1 = test1.getEmployees();
		ls1.sort(byName);
		
		
		
		Comparator<Employee> byEid = (e1,e2) -> e1.getDept().compareTo(e2.getDept());
		ls.sort(byEid);
		ls.stream().forEach(e->System.out.println(e.getDept()));
	}
}
