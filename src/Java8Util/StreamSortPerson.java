package Java8Util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamSortPerson {
	public static void main(String a[]) {
		List<Person> lst = new ArrayList();
		Set<Person> setP = new HashSet<Person>();
		
		lst.add(new Person("Sasi", "r", 32));
		lst.add(new Person("srikanth", "g", 38));
		lst.add(new Person("ravikanth", "r", 42));
		
		
		Person per = lst.stream()
		.max(Comparator.comparing(Person::getAge))
		.orElseThrow(NoSuchElementException::new);
		
		System.out.println(per.getFirstname() +" - "+ per.getAge());
		
		
		System.out.println(lst.stream().collect(Collectors.averagingInt(p -> p.getAge())));
		
		//lst.removeIf(p -> !setP.add(p.getFirstname()));
		//lst.stream().collect(Collectors.groupingBy(Person::getId))
	}
}
