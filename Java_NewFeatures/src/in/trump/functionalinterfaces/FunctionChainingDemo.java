package in.trump.functionalinterfaces;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		Function<String, String> upperCase = s -> s.toUpperCase();
		Function<String, String> subString = s -> s.substring(0, 3);
		
		System.out.println(upperCase.apply("trumptech"));
		System.out.println(subString.apply("trumptech"));
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(upperCase.andThen(subString).apply("trumptech"));
		System.out.println(upperCase.compose(subString).apply("students"));
	}

}
