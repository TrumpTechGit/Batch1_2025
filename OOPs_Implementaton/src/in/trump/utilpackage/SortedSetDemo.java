package in.trump.utilpackage;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<>();
		
		//inserts values from 10 to 20(10,11,12....)
		for(int i = 10; i <= 20; i++) {
			ss.add(i);
		}
		
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet(16));
		System.out.println(ss.tailSet(18));
		System.out.println(ss.subSet(12,17));
		System.out.println(ss.comparator());
		System.out.println("-----------------------------------------------");
		SortedSet<Integer> ss1 = new TreeSet<>();
		ss1.add(12);
		ss1.add(10);
		ss1.add(21);
		ss1.add(9);
		
		System.out.println(ss1);
		
		
	}

}
