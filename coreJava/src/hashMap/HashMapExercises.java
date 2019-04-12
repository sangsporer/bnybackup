package hashMap;

import java.util.HashMap;

public class HashMapExercises {

	public HashMapExercises() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
/*		- Problem 01:
			Modify and return the given map as follows: if the key "a" has a value, 
			set the key "b" to have that value, and set the key "a" to have the value "". 
			Basically "b" is a bully, taking the value and replacing it with the empty string.
			mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
			mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
			mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
		// TODO Auto-generated method stub
*/
		
		
		HashMap<String, String> mapBully = new HashMap<String, String>();
		
		mapBully.put("a", "candy");
		mapBully.put("b", "carrot");
		mapBully.put("c", "meh");
		
		System.out.println("======================Before Bully=====================");
		for (HashMap.Entry<String, String> entry : mapBully.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		String value = mapBully.get("a");
		if (value != null) {
			mapBully.replace("b", value);
			mapBully.replace("a", "");
		}
		
		System.out.println("======================after Bully=====================");
		for (HashMap.Entry<String, String> entry : mapBully.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
/* - Problem 02:
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. 
In all cases remove the key "c", leaving the rest of the map unchanged.
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
*/
		
		HashMap<String, String> mapBully2 = new HashMap<String, String>();
		
		mapBully2.put("a", "aaa");
//		mapBully2.put("b", "xyz");
		mapBully2.put("c", "meh");
		mapBully2.put("d", "hi");
		
		System.out.println("======================Before Bully 2=====================");
		for (HashMap.Entry<String, String> entry : mapBully2.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		String value2 = mapBully2.get("a");
		if (value2 != null) {
			if (mapBully2.containsKey("b")) {
			mapBully2.replace("b", value2);	
			}
			else {
				mapBully2.put("b", value2);
			}
		}
		
		mapBully2.remove("c");
		
		System.out.println("======================after Bully 2=====================");
		for (HashMap.Entry<String, String> entry : mapBully2.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
/*- Problem 03:
Modify and return the given map as follows: for this problem the map may or may not contain 
the "a" and "b" keys. If both keys are present, append their 2 string values together and store 
the result under the key "ab".
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
*/
		
		HashMap<String, String> mapBully3 = new HashMap<String, String>();
		
		mapBully3.put("a", "Hi");
//		mapBully3.put("b", "There");
		
		System.out.println("======================Before Bully 3=====================");
		for (HashMap.Entry<String, String> entry : mapBully3.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		String valueA = mapBully3.get("a");
		String valueB = mapBully3.get("b");
		if (valueA != null && valueB != null) {
			if (mapBully3.containsKey("a") && mapBully3.containsKey("b")) {
			mapBully3.put("ab", valueA + " " + valueB);	
			}
		}
		
		
		System.out.println("======================after Bully 3=====================");
		for (HashMap.Entry<String, String> entry : mapBully3.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
/*- Problem 04:
- Problem 04: Optional
Given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream"
 is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".
topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
*/
		
		HashMap<String, String> topping1 = new HashMap<String, String>();
		
//		topping1.put("ice cream", "peanuts");
		topping1.put("pancake", "syrup");
		
		System.out.println("======================Before Optional=====================");
		for (HashMap.Entry<String, String> entry : topping1.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
		String valueIceCream = topping1.get("ice cream");
//		String valueB = mapBully3.get("b");
		if (valueIceCream != null) {
			if (topping1.containsKey("ice cream")) {
			topping1.replace("ice cream", "cherry");
			}
		}
		
		topping1.put("bread", "butter");
		
		
		System.out.println("======================after optional=====================");
		for (HashMap.Entry<String, String> entry : topping1.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		
	}

}
