package in.trump.classes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>  al = new ArrayList<>();
		al.add(3);
		al.add(7);
		al.add(2);
		al.add(4);
		al.add(9);
		
		System.out.println("element before sorting : "+al);
		
		
		Collections.sort(al);
		System.out.println("elements after sorting :"+al);
		
		//using lambda expression in place comparator obj - cso
		Collections.sort(al, (a1,a2) -> (a1>a2) ? -1  :  (a1 < a2) ? 1 :  0);
		System.out.println("elements after custom sorting :"+al);
		

	}

}
