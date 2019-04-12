package sortMethods;


import java.util.Arrays;

public class selectionSort {
	
	public static void sort(int[] num) {
		for(int i=0; i<num.length; i++) {
		// find the minimum in the list [i. . list.length-1]
		int currentMin = num[i];
		int currentMinIndex = i;
			for (int j = i+1; j<num.length; j++) {
				if (currentMin > num[j]) {
					currentMin = num[j];
					currentMinIndex = j;
				}	
			}
		// swap list[i] with list[currentMinIndex] if necessary;
		if (currentMinIndex!=i) {
			num[currentMinIndex] = num[i];
			num[i] = currentMin;
		}
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5,4,3,2,1};
		sort(num);
		
		System.out.println(Arrays.toString(num));

		
	}

}
