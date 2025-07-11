package in.trump.utilpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(11, "Raj");
		hm.put(12, "Tej");
		hm.put(13, "Hari");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		Set<Integer> ks = hm.keySet();
		System.out.println(ks);
		
		Collection<String> cvalues = hm.values();
		System.out.println(cvalues);
		
		Set<?> entries = hm.entrySet();
		System.out.println(entries);
		
		System.out.println(hm.containsKey(12));
		System.out.println(hm);
		
	}

}
