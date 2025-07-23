package in.trump.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		//creating a consumer
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		printUpperCase.accept("Hello trump tech !!");

	}

}
