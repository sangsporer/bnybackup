package Arrays;


import java.util.Arrays;

public class returnMethod {
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for(int i = 0, j = result.length-1; 
				i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1,2,3,4,5,6};
		int[] list2 = reverse(list1);
		
		System.out.println("List 1 is: " +Arrays.toString(list1));
		System.out.println("Reverse list is: " +Arrays.toString(list2));
	}
}
