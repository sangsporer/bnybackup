package Arrays;

import java.util.Arrays;


public class printArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		
		//printing array using enhanced for loop = "forEach in javascript"
		for(int element: arr) {
			System.out.println(element);
		}	
		//printing array using for Loop
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//printing array using for Loop

		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
