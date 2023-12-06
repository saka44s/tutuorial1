package Java8Feat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test1 {
	public static void main(String a[]) {
		List<Person> persons = addPersons();
		
		//sort
		Collections.sort(persons, (p1, p2)-> p1.getFirstname().compareTo(p2.getFirstname()));
		//System.out.println(persons);
		
		printAll(persons,p->true,p->System.out.println(p));
		printAll(persons,p->p.getFirstname().startsWith("S"),p->System.out.println(p.getFirstname()));
		printAll(persons, p->p.getLastname().endsWith("i"),p->System.out.println(p.getFirstname()+"-"+p.getLastname()));
		
	}
	
	private static void printAll(List<Person> persons, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: persons) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

	private static List<Person> addPersons() {
		List<Person> persons =  Arrays.asList(
				new Person("Srikar", "Gotti", 35),
				new Person("Javed", "Mian", 35),
				new Person("Kakkar", "Mosi", 35),
				new Person("Victor", "Jera", 35),
				new Person("Ravish", "Jannu", 28)
				);
		return persons;
	}
	

}

