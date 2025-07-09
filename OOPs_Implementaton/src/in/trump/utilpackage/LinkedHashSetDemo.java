package in.trump.utilpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//creation of collection obj (ArrayList, HashSet ...)
		List<String> list = Arrays.asList("apple","banana","apple","orange");
		
		//pass the collection to LinkedHashSet
		LinkedHashSet<?> lhs = new LinkedHashSet<>(list);
		
		//print the lhs collection obj
		System.out.println(lhs);

	}

}
