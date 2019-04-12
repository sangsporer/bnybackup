package maps;

import java.util.HashMap;
import java.util.Map;

public class myMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		
		m1.put(1, "Mango");
		m1.put(2, "Orange");
		m1.put(3, "hoi");
		m1.put(3, "io");
		m1.put(3, "Banana");
		
		System.out.println(m1.keySet());
		System.out.println(m1.values()); //hash map prints
	}

}
