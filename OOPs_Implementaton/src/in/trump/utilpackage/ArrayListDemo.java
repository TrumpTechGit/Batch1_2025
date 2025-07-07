package in.trump.utilpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("trump");
		al.add(101);
		al.add(202.05);
		System.out.println(al);
		al.add(101);
		al.add("trump");
		System.out.println(al); // insertion and duplicates
		al.remove(1);
		System.out.println(al);
		System.out.println("----------------------------------------------");
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("tech");
		al1.add("institute");
		al1.add("students");
		al1.add("classroom");
		//al1.add(123);
		//System.out.println(al1);
		Iterator<String> iterator = al1.iterator();
		//to print elements using iterator
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("----------------forward direction LI----------------------------------------");
		ListIterator<String> listIterator = al1.listIterator();
		while(listIterator.hasNext()) {
			String element1 = listIterator.next();
			System.out.println(element1);
		}
		
		System.out.println("-------------------------backward direction LI-------------------------------");
		// Now iterate backward
		while (listIterator.hasPrevious()) {
		    String element = listIterator.previous();
		    System.out.println(element);
		}

	}

}
