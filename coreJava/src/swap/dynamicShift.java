package swap;

import java.util.Arrays;
import java.util.Scanner;

public class dynamicShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myList = {0,1,2,3,4,5,6,7,8,9,10};
		Scanner input = new Scanner(System.in);
		
//		prompt user for shift number
		System.out.println("Please enter number of position to shift to right");
		
		int s = input.nextInt();

		int[] t = new int[s];

		for (int i = 0; i < s; i++) {
			t[i] = myList[myList.length - s + i];
		}

		for (int i = myList.length - 1; i >= s; i--) {
//			System.out.println("Index right now: " + i);
//			System.out.println("Index from which we take value: " + (i - s));
			myList[i] = myList[i - s];
		}
//		System.out.println(Arrays.toString(t));

		// Move the last 2 element to fill in the first 2 position
		for (int i = 0; i < s; i++) {
			myList[i] = t[i];
		}

		System.out.println(Arrays.toString(myList));
		
		
		input.close();
	}

}
