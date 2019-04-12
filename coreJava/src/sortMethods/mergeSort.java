package sortMethods;

import java.util.Arrays;

public class mergeSort {
	
	public static void mergeSort(int[] arr) {
		//checking if array can be divided
		if (arr.length < 2) {
			return;
		}
		
		int mid = arr.length/2;
		//creating left sub-array
		int[] leftArr = new int[mid];
		//creating right sub-array
		int[] rightArr = new int[arr.length - mid];
		
		//initializing left sub-array
		for (int i = 0; i <mid; i++) {
			leftArr[i] = arr[i];
		}
		
		//initializing right sub-array
		for (int i = mid; i < arr.length-1; i++) {
			rightArr[i-mid] = arr[i];
		}
		
		//invoking recursive method for the left sub-array
		mergeSort(leftArr);
		
		//invoking recursive method for the right sub-array
		mergeSort(rightArr);
		
		//invoking merge method to sort and merge
		merge(arr, leftArr, rightArr);
							
	}
	
	public static void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int i=0;
		int j=0;
		int k=0;
		while (i<leftArr.length && j<rightArr.length) {
			if (leftArr[i]<=rightArr[j]) {
				arr[k++] = leftArr[i++];	
			}else {
				arr[k++] = rightArr[j++];
			}
		}while (i<leftArr.length) {
			arr[k++] = leftArr[i++];
		}while (j<rightArr.length) {
			arr[k++] = rightArr[j++];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 6, 8, 5, 7, 3, 4};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
