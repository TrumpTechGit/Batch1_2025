package in.trump.utilpackage;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Raju",200);
		ht.put("Kiran", 300);
		ht.put("Uday", 210);
		ht.put("Hari", 415);
		System.out.println(ht);
		//to get keys
		Enumeration e = ht.keys();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
