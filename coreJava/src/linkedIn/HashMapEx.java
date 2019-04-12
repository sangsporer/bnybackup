package linkedIn;

import java.util.HashMap;

public class HashMapEx {

	public HashMapEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "phonebook";
		HashMap<Character, Integer> hashMap = new HashMap();
		for (int i = 0; i < s.length(); i++) {
			Character currentChar = s.charAt(i);
			if(hashMap.containsKey(currentChar)) {
				hashMap.put(currentChar, hashMap.get(currentChar)+1);
			} else {
				hashMap.put(currentChar, 1);
			}
			
		}
		
		Character mostRepeated = ' ';
		int max = 0;
		for (Character key : hashMap.keySet()) {
			int currentValue = hashMap.get(key);
			if (currentValue > max) {
				mostRepeated = key;
				max = currentValue;
			}
		}
		System.out.println("Most Repeated: " + mostRepeated + " | Times: " + max);
	}

}
