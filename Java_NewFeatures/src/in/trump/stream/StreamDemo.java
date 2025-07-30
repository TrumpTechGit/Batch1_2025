package in.trump.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		//Approach - 1
		Stream<Integer> stream1 = Stream.of(1,2,3,4,5); 
		System.out.println(stream1);
		
		//Approach 2
		List<String> li = new ArrayList<>();
		li.add("trump");
		li.add("tech");
		li.add("students");
		li.add("classes");
	//	li.add(12);
		
		Stream<String> stream2 = li.stream();
		System.out.println(stream2);
	}

}
