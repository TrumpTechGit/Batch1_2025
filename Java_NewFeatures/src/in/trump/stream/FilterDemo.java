package in.trump.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("teja","ravi","sunny","arjun");
		Stream<String> stream = names.stream();
		//stream.filter(name -> name.startsWith("s")).forEach(name -> System.out.println(name));
		stream.filter(name -> name.startsWith("s")).forEach(System.out::println);
		}
}
