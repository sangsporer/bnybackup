package hashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapAccess {

	public LinkedHashMapAccess() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();
//		
//		//map 1
//		hmap1.put(100, "NY");
//		hmap1.put(2, "NJ");
//		hmap1.put(3, "CA");
//		hmap1.put(3, "PA");
//		hmap1.put(null, "MI");
//		hmap1.put(4, "null");
//		hmap1.put(5, "ND");
//		hmap1.put(200, "NY");
//		
//		//map 2
//		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
//		hmap2.put(999, "PQ");
//		hmap2.put(1000, "QR");
//		
//		//print statements
//		System.out.println(hmap1.containsValue("MI"));
//		System.out.println(hmap1.containsValue("null"));
//		System.out.println(hmap1.get(200).hashCode());
//		System.out.println(hmap1.replace(2, "XY"));
//		System.out.println(hmap1.remove(2));
//		
//		//adding map into map
//		hmap1.putAll(hmap2);
////		hmap2.putAll(hmap1);
//		
//		//with entrySet - order of insert is not the same ordering by key
//		System.out.println("======================All entries=====================");
//		for (Map.Entry<Integer, String> entry : hmap1.entrySet())
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

		//linked hash map
		//map 1
//		LinkedHashMap<Integer, String> lmap1 = new LinkedHashMap<Integer, String>();
//		
//		lmap1.put(100, "NY");
//		lmap1.put(2, "NJ");
//		lmap1.put(3, "CA");
//		lmap1.put(3, "PA");
//		lmap1.put(null, "MI");
//		lmap1.put(4, "null");
//		lmap1.put(5, "ND");
//		lmap1.put(200, "NY");
//		
//		//map 2
//		LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<Integer, String>();
//		
//		lmap2.put(999, "PQ");
//		lmap2.put(1000, "QR");
//		
//		lmap1.putAll(lmap2);
//		
//		System.out.println(lmap1.putIfAbsent(201, "AB"));
//		
//		//with entrySet - order of insert is not the same ordering by key
//		System.out.println("======================All entries=====================");
//		for (Map.Entry<Integer, String> entry : lmap1.entrySet())
//			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		//linked hash map access order
		//map 1
		LinkedHashMap<Integer, String> lmap1Access = new LinkedHashMap<Integer, String>(16, .75f, true);
		
		lmap1Access.put(100, "NY");
		lmap1Access.put(2, "NJ");
		lmap1Access.put(3, "CA");
		lmap1Access.put(3, "PA");
		lmap1Access.put(null, "MI");
		lmap1Access.put(4, "null");
		lmap1Access.put(5, "ND");
		lmap1Access.put(200, "NY");
		
		//map 2
		LinkedHashMap<Integer, String> lmap2Access = new LinkedHashMap<Integer, String>(16, .75f, true);
		
		lmap2Access.put(999, "PQ");
		lmap2Access.put(1000, "QR");
		
		lmap1Access.putAll(lmap2Access);
		
		System.out.println(lmap1Access.putIfAbsent(201, "AB"));
		
		//accessing elements
		
		lmap1Access.get(100);
		lmap1Access.get(100);
		lmap1Access.get(1000);
		lmap1Access.get(999);
		
		
		
		//with entrySet - order of insert is not the same ordering by key
		System.out.println("======================All entries=====================");
		for (Map.Entry<Integer, String> entry : lmap1Access.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		
		
	}

}
