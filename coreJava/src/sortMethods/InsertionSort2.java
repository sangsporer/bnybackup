package sortMethods;

import java.util.Arrays;

import javax.xml.transform.Templates;

public class InsertionSort2 {
	
	//insert sort ascending
	
	public static void insertSortAsc(int[] list) {
		int inserts=0;
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-1-i; j++) {
				if(list[j]>list[j+1]){
					int temp = list[j];	
					list[j] = list[j+1];
					list[j+1] = temp;
					inserts++;
				}
			}
		}
		System.out.println("Sorted list is: "+Arrays.toString(list));
		System.out.println("Number of iteration is: "+list.length*list.length);
		System.out.println("Number of inserts: "+inserts);
	}
	
	public static void insertSortDesc(int[] list) {
		int inserts=0;
		for (int i = 0; i < list.length-1; i++) {
			for (int j = 0; j < list.length-1-i; j++) {
				if(list[j]<list[j+1]){
					int temp = list[j];	
					list[j] = list[j+1];
					list[j+1] = temp;
					inserts++;
				}
			}
		}
		System.out.println("Sorted list is: "+Arrays.toString(list));
		System.out.println("Number of iteration is: "+list.length*list.length);
		System.out.println("Number of inserts: "+inserts);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		int[] list= {-1, 6, 5, -3, 9,8,-2, 7}; //my list to be sorted
		
		//call the method on list
		
		insertSortAsc(list);
		insertSortDesc(list);
		
		
		
		//create new array with that is larger
		
		
		/*Insertion Sort works by creating a "sorted" list, and gradually adding elements from 
		 * the original list to it. For each iteration through the original list, it compares the 
		 * current value to each value in the sorted list. It then inserts the value to the sorted 
		 * list above the values less than it and below the values greater than it.

Create a method that will sort an array of integers using Insertion Sort. 
These integers should be sorted in ascending order.
Print out the sorted array, the number of iterations and swaps that were done.
Create a second method that will do the same thing, in descending order. */
	}

}
