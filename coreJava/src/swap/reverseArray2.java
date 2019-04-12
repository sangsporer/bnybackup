package swap;

import java.util.Arrays;

public class reverseArray2 {
	
	public static int[] reverse(int[] list) {
		
		
		for(int i = 0; i < list.length/2; i++) {
			int temp=list[i];
			list[i]=list[list.length-1-i];
			list[list.length-1-i]=temp;
			
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3,4,5,6};
		
//		System.out.println("Original list is: " +Arrays.toString(list));
		list= reverse(list);
		
		
		System.out.println("Reverse list is: " +Arrays.toString(list));
	}
}
