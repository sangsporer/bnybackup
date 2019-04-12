package hashMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import Loops.tuition;

public class TreeTreeMap {

	public TreeTreeMap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tmap1 = new TreeMap<Integer, String>();
		
		tmap1.put(100, "NY");
		tmap1.put(2, "NJ");
		tmap1.put(3, "CA");
		tmap1.put(3, "PA");
//		tmap1.put(null, "MI");
		tmap1.put(4, "null");
		tmap1.put(5, "ND");
		tmap1.put(200, "NY");
		
		//map 2
		TreeMap<Integer, String> tmap2 = new TreeMap<Integer, String>();
		
		tmap2.put(999, "PQ");
		tmap2.put(1000, "QR");
		
		tmap2.putAll(tmap2);
		
		System.out.println(tmap2.putIfAbsent(201, "AB"));
		
		//accessing elements
		
		TreeMap<Integer, String> newMap = new TreeMap<>(Collections.reverseOrder());
		newMap.putAll(tmap1);
		
		
		//with entrySet - order of insert is not the same ordering by key
		System.out.println("======================All entries=====================");
		for (Map.Entry<Integer, String> entry : tmap1.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		System.out.println("======================Reverse order=====================");
		for (Map.Entry<Integer, String> entry : newMap.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		

	}

}
