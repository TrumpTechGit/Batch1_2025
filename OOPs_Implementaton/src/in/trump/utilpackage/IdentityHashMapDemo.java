package in.trump.utilpackage;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		IdentityHashMap<String, String> ihm = new IdentityHashMap<>();
		String key1 = new String("Hello");
		String key2 = new String("Hello");
		
		ihm.put(key1,"world 1");
		ihm.put(key2, "world 2");
		ihm.put(key2, "world 3");
		ihm.put(key2, "world 4");
		
		System.out.println(ihm);
		
		System.out.println("value for key 1:"+ihm.get(key1));
		System.out.println("value for key 2:"+ihm.get(key2));

	}

}
