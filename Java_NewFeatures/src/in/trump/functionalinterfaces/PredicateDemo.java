package in.trump.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		System.out.println("---------------------------------------");
		String[] names = {"ajay","teja", "trump", "arjun", "john"};
		Predicate< String> p1 = s -> s.charAt(0) == 't';
		for(String name : names) {
			if(p1.test(name)) {
				System.out.println(name);
			}
				
		}
	}
}
