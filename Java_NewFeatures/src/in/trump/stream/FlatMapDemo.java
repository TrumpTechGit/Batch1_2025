package in.trump.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		List<String> beCourses = Arrays.asList("Java","python", "c");
		List<String> feCourses = Arrays.asList("react","angular", "vue");
		List<String> cloudCourses = Arrays.asList("aws","azure", "gcp");
		
		List<List<String>> trumpins = Arrays.asList(beCourses, feCourses, cloudCourses);
		//to convert trumpins to stream
		Stream<List<String>> stream1 = trumpins.stream();
		stream1.flatMap(s -> s.stream()).forEach(name -> System.out.print(name+", "));
		
	}
	
	// 1 2 3 4 5 6 6 7

}
