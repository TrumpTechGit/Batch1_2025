package in.trump.stream;

//ctrl + shift + o
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Brian", "Charlie");
		
		Map<Character, List<String>> groupByFirstLetter = names.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		
		System.out.println(groupByFirstLetter);
		

	}

}
