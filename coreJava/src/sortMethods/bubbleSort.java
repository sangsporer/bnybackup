package sortMethods;

import java.util.Arrays;

public class bubbleSort {
	
	public static void bSort(int[] num) {
		
		//using while
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp;
		
		while (flag) { // to keep running the while loop
			flag = false; //set flat to false assuming already sorted, but waiting for possible swap
			for(j=0; j<num.length-1; j++) {
				if (num[j]>num[j+1]) {
					temp=num[j]; 	//swap elements
					num[j]=num[j+1];
					num[j+1]=temp;
					flag = true; 	//shows a swap occured
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  num = {11, 10, 5, 3, 20, 15, 20, 35, 70};
		bSort(num); //invoking method bSort and passing the argument
		System.out.println(Arrays.toString(num));

	}

}
