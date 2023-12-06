package Java8Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMinMaxPerson {
	public static void main(String a[]) {
		List<Person> lst = new ArrayList();
		
		lst.add(new Person("Sasi", "r", 32));
		lst.add(new Person("srikanth", "g", 38));
		lst.add(new Person("ravikanth", "r", 42));
		
		
		Comparator<Person> byAge = (p1,p2) -> p2.getAge().compareTo(p1.getAge());
		
		lst.sort(byAge);
		
		lst.forEach(p->System.out.println(p.getFirstname()+""+p.getAge()));
		
		lst.stream()
		.mapToInt(p -> p.getAge())
		.average().ifPresent(avg -> System.out.println(avg));
		
        Map<String, Integer> result2 = lst.stream().collect(
                Collectors.toMap(p->p.getFirstname(), p->p.getAge()));
        
        System.out.println(result2);
		
	}
}
