package in.trump.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dhoni","Sachin","Yuvi","Sunil");
		Map<String, Integer> namesmap = names.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(namesmap);
	}

}
