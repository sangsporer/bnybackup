package hackerrank;

import java.util.Arrays;
import java.util.SortedMap;

import Arrays.initialArray;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "anagramm";
		String b = "marganaa";
		
		boolean isAnagram = false;
		
		char[] aArr = a.toLowerCase().toCharArray();
		char[] bArr = b.toLowerCase().toCharArray();
		
		if (aArr.length!=bArr.length) {
			isAnagram = false;		
		}
		
		Arrays.sort(aArr);
		a = new String(aArr);
		System.out.println("sorted string a: " +a);
		Arrays.sort(bArr);
		b = new String (bArr);
		System.out.println("sorted string b: " +b);
		
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)!=b.charAt(i)) {
				isAnagram = false;
				break;
			}else isAnagram = true;
		}					
		System.out.println((isAnagram)?"Anagrams":"Not Anagrams");		

	}

}
