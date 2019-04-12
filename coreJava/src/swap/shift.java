package swap;

import java.util.Arrays;

public class shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myList= {1,2,3,4,5};
		
		//generate an index j randomly with 0 <= j <=i
		for (int i=myList.length-1; i>0; i--) {
			int j = (int)(Math.random()*(i+1));
			System.out.println("j " + j);
		
		
		//swap myList[i] with myList[j]
		
		int temp = myList[i];
		myList[i] = myList[j];
		myList[j] = temp;
		 System.out.println("temp: " + temp);
		 System.out.println("myList[i]: " + myList[i]);
		 System.out.println("myList[j]: " + myList[j]);
		
		}	System.out.println(Arrays.toString(myList));
	}

}
