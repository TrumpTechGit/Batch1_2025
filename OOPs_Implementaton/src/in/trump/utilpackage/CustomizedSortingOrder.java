package in.trump.utilpackage;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CustomizedSortingOrder {

	public static void main(String[] args) {
		SortedSet<Integer> ss1 = new TreeSet<>(new MyComparator());
		ss1.add(12);
		ss1.add(10);
		ss1.add(21);
		ss1.add(9);
		ss1.add(0);
		System.out.println("sorting order: "+ss1	);
		
	}
	static class MyComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer i1, Integer i2) {
			if(i1 < i2)    //this logic gives descending order 
				return 1;
			if(i1 > i2)
				return -1;
			return 0;
		//	return i2.compareTo(i1); // descending order
		//	return i1.compareTo(i2); //Ascending order
		//	return -i2.compareTo(i1);  //Ascending order
		//	return -i1.compareTo(i2); //descending order
		//	return 1;
		//return -1;
		//	return 0;
		}

	
		
	}
	
	}


