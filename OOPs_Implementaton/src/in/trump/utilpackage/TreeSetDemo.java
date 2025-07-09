package in.trump.utilpackage;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		System.out.println(ts.isEmpty());
		//ts.add(null); //NPE
		ts.add("banana");
		ts.add("apple");
		System.out.println(ts);

	}

}
