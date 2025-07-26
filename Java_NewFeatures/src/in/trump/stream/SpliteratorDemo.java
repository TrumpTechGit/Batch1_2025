package in.trump.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("trump","tech","java");
		Spliterator<String> namespliterator = names.spliterator();
		namespliterator.forEachRemaining(System.out::println);

	}

}
