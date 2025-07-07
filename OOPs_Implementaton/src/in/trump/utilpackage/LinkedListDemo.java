package in.trump.utilpackage;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("trump");
		ll.add(101);
		ll.add(202.05);
		ll.add(null);
		ll.add("trump");
		System.out.println(ll);
		ll.add(0, "java");
		System.out.println(ll); 
		ll.set(0, "oracle");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		
	}

}
