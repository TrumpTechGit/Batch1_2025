package in.trump.functionalinterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
//		BiPredicate<String, Integer> filter = (x,y) -> { 
//			return x.length() == y;
//			};
		
		BiPredicate<String, Integer> filter = (x,y) ->  x.length() == y;
			
			
		boolean result = filter.test("trump", 5);
		System.out.println(result);
		
		boolean result1 = filter.test("trump", 10);
		System.out.println(result1);
		

	}

}
