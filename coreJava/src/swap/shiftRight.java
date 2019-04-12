package swap;

import java.util.Arrays;

public class shiftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList= {0,1,2,3,4,5,6};
		//shift right by 2
		int s = 8;//number of rotations
		
		for (int i = 0; i < s; i++) { 
			// take out the last element 
			int temp = myList[myList.length-1]; 
			for (int j = myList.length-1; j >0; j--) { 
				// shift array elements towards left by 1 place 
				myList[j] = myList[j - 1]; 
				} myList[0] = temp; 
		}
		System.out.println(Arrays.toString(myList));		
	}
}
