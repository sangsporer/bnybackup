package swap;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class dynamicShift2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myList = {0,1,2,3,4};
		Scanner input = new Scanner(System.in);
		
//		prompt user for shift number to left
		System.out.println("Please enter number of position to shift to left");
		
		int s = input.nextInt();

		//preserve s spots from the beginning
		int[] t = new int[s];

		for (int i = 0; i < s; i++) {
			t[i] = myList[i];
		}
		System.out.println("my ts are: " + Arrays.toString(t));
		//shift list to the left by s
		for (int i = s; i<myList.length - s; i++) {
			System.out.println("Index right now: " + i);
			System.out.println("Index from which we take value: " + (i + s));

			myList[i-s] = myList[i];
		}

		

		// Move the last 2 element to fill in the first 2 position
		for (int i = myList.length-s; i > s; i--)  {
			myList[i] = t[s];
		}

		System.out.println(Arrays.toString(myList));
		
		
		
	}

}
