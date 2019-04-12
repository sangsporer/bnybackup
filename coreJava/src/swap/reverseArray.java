package swap;

import java.util.Arrays;

public class reverseArray {
	
	public static int[] reverse(int[] list) {
		
		
		for(int i = 0, j=list.length-1; i < list.length/2; i++, j--) {
			int temp=list[j];
			list[j]=list[i];
			list[i]=temp;
			
		}
		return list;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		System.out.println("Original list is: " + Arrays.toString(list));
		list= reverse(list);
		
		
		System.out.println("Reverse list is: " + Arrays.toString(list));
		
		
		
	}
}
