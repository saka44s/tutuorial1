package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test1 {

	public static void main(String[] args) {
		testme();
	}
	

	public static void testme() {
		getEmployees();
		Stream<Employee> str = getEmployees().stream();
		
		List<Employee> lst= getEmployees().stream()
				.filter(s->s.getName().startsWith("S"))
				.collect(Collectors.toList());


		//str.forEach(s->System.out.println(s.getName()+"-"+s.getDept()));
		
		//List<Employee> ls = str.map(test1::testVO).collect(Collectors.toList());
		
		List<Employee> ls1 = str.distinct().collect(Collectors.toList());
		
		ls1.stream().forEach(c -> System.out.println(c.getName()+"-"+c.getDept()));

		
		System.out.print("--Done");
	}
	
	public static Employee testVO(Employee e) { 
		if(e.getName().startsWith("S")) {
			e.setDept(e.getDept()+"-ITG");
		}
		return e;
    }
	
	
	public static List<Employee> getEmployees(){
		List<Employee> el = new ArrayList<Employee>();
		
		el.add(new Employee("sasi", "dept1", 2000, 3));
		el.add(new Employee("ravi", "dept1", 1000, 2));
		el.add(new Employee("james", "dept2", 4000, 1));
		el.add(new Employee("manish", "dept3", 5000, 4));
		el.add(new Employee("manish", "dept3", 5000, 4));
		return el;
	}

}
