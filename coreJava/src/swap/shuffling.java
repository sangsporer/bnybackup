package swap;

import java.util.Arrays;

public class shuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList= {1,2,3,4,5};
		
		int shift = 2;
		
//		int temp = myList[0]; //retain the first element
//		
//		//shift element left
//		
//		for (int i =1; i<myList.length; i++) {
//			myList[i-1]=myList[i];
//		}
		
		//Move the first element ot fill in the last position
		
//		myList[myList.length-1]=temp;
//	
//		System.out.println(Arrays.toString(myList));
		
		//shift element right 2
		
		int temp1 = myList[myList.length-1]; //retain the last element
		int temp0 = myList[myList.length-2]; //retain the 2nd to last element
		
		
		for (int i = myList.length-1; i>=shift; i--) {
			System.out.println("Index right now: "+i);
			System.out.println("Index from which we take value: "+(i-shift));

			myList[i] = myList[i-shift];
		}
		
				
				//Move the last 2 element to fill in the first 2 position
				
				myList[1]=temp1;
				myList[0]=temp0;
			
				System.out.println(Arrays.toString(myList));
	}

}
