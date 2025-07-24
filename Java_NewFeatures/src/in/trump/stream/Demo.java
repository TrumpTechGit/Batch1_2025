package in.trump.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Person p1 = new Person("Max", 22, "Hyd");
		Person p2 = new Person("Jhon", 24, "Hyd");
		Person p3 = new Person("Hari", 20, "Hyd");
		Person p4 = new Person("Trump", 21, "Mumbai");
		Person p5 = new Person("Giri", 22, "Mumbai");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		persons.stream()
		.filter(p -> (p.getAge() > 21 && p.getAge() < 24))
		.forEach(p -> System.out.println(p));
		
		System.out.println("-----------------------------------------------------------------------");
		List<Person> persons1 = Arrays.asList(p1,p2,p3,p4,p5);
		persons1.stream()
		.filter(p -> p.getAddrs().equals("Hyd"))
		.forEach(System.out::println);
		

	}

}
