package swap;

import java.util.Arrays;

public class shiftLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList= {0,1,2,3,4,5,6};
		//shift left by 2
		int s = 5;//number of rotations
		
		for (int i = 0; i < s; i++) { 
			// take out the first element 
			int temp = myList[0]; 
			for (int j = 0; j < myList.length - 1; j++) { 
				// shift array elements towards left by 1 place 
				myList[j] = myList[j + 1]; 
				} myList[myList.length - 1] = temp; 
		}
		System.out.println(Arrays.toString(myList));		
	}
}
