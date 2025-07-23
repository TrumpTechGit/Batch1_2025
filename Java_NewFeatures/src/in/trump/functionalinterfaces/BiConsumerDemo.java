package in.trump.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		BiConsumer<String,String> addString = (s1,s2) -> System.out.println(s1+s2);
		addString.accept("Hello"," Trump");
		System.out.println("----------------------------------------------------------------");
		//using collections
		List<String> items = Arrays.asList("Apple", "Banana", "Orange");
		
		//print the list with index
		BiConsumer<Integer, String> printWithIndex = (index,value) -> System.out.println("Index :"+index+", value :"+value);
		
		//iterate the loop using traditional for
		for(int i=0; i<items.size(); i++) {
			printWithIndex.accept(i, items.get(i));
		}

	}

}
