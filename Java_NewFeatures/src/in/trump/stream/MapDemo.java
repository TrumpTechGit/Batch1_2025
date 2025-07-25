package in.trump.stream;

//import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		//List<String> names = Arrays.asList(null)
		List<String> names = List.of("trump","institute","classroom","students");
		//names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		Stream<String> stream = names.stream().map(name -> name.toUpperCase());
		stream.forEach(System.out::println);
	}
}
