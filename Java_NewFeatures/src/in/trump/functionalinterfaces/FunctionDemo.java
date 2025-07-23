package in.trump.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// to find the length
		Function<String, Integer> stringLength = str -> str.length();
		System.out.println("Length of the String is : "+stringLength.apply("Welcome"));
		System.out.println("-----------------------------------------------------------");
		//to remove spaces in string
		Function<String, String> removeSpaces = s -> s.replace(" ","");
		System.out.println(removeSpaces.apply("Hello    Trump"));
		System.out.println("-----------------------------------------------------------");
		//count no. of spaces in a given String
		Function<String, Integer> countSpaces = s -> s.length() - s.replace(" ", "").length();
		System.out.println(countSpaces.apply("Hello Trump  Tech "));
	}
}
