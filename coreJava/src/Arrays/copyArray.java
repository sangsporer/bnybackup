package Arrays;

import java.util.Arrays;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1= {5,6,7,8,9};
		int[] list2 = {1,2,3,4,5};
		
		list2=list1;
		
		list1[3] =80;
		
		System.out.println(Arrays.toString(list2));
		System.out.println(Arrays.toString(list1));
		
		System.out.println(list1);
		System.out.println(list2);
		
}

}
