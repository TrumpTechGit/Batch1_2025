package in.trump.functionalinterfaces;

import java.util.function.Predicate;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class PredicateDemo2 {

	public static void main(String[] args) {
		Person person = new Person("Alex", 23);
		
		//create a predicate. It return true if age is > 18
		Predicate<Person> greaterThanEighteen = (p1) -> p1.age > 50;
		//create a predicate. It return true if age is < 60
		Predicate<Person> lessThanSixty = (p2) -> p2.age > 50;
		System.out.println( greaterThanEighteen.test(person));
		System.out.println(lessThanSixty.test(person));
		
		//joining predicate
		Predicate<Person> jp = greaterThanEighteen.or(lessThanSixty);
		System.out.println(jp.test(person));
		
		// do practicals on .negate()
	}
}
