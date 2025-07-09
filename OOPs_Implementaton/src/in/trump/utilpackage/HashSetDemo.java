package in.trump.utilpackage;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(); 
		hs.add(27);
		hs.add(12);
		hs.add(null);
		hs.add(null);
		hs.add(10);
		hs.add(10);
		hs.add(21);
		// for each loop
		for(Integer e : hs) {
			System.out.println(e);
		}

	}

}
