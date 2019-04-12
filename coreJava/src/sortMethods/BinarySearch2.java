package sortMethods;

import java.awt.ItemSelectable;
import java.util.Scanner;

public class BinarySearch2 {
	
//	binary search then do linear if not using recursive
	
//	public static int biSearch (int key, int[] ordArr){
//		//declare and initialize middle index point
//		int midI=ordArr.length/2;
//		int lastI=ordArr.length-1;
//		int firstI=0;
//		//if key equals middle of list just return index
//		if(key==ordArr[midI]) {
//			return ordArr[midI];
//		}
//		
//		//if key is less than middle, ignore top half and set index as such
//		if(key<ordArr[midI]) {
//			lastI=midI;
//			midI=lastI/2;		
//		}
//		
//		//if key is greater than the middle, ignore bottom half and set index as such
//		
//			
//			
//		}
		
		
//		
//		
//		return -1;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter ordered list of numbers");
		
		String numbers = input.next();
		
		String delimiter = ",";
		
		numbers = numbers.replaceAll("\\s+", "");
		
		String[] numArr = numbers.split(delimiter);
		
//		int key = 5;
//		int[] ordArr = {1, 3, 5, 7, 9, 10};
//		
//		if(key>ordArr[ordArr.length/2]) {
//			if (key>ordArr[])
//		}
//			firstI=midI;
//			lastI=ordArr.length-midI;
//			midI=lastI/2;
		
		

	}

}
