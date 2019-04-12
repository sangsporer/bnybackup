package sortMethods;

import java.util.Arrays;

public class InsertionSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1= {1, 3, 5, 9, 10}; //my list - assumed to be ordered
		
		int x = -1; //number to be inserted
		
		//create new array with that is larger
		int[] list2=new int[list1.length+1];
		
		//if x is out of bound
		if (x>=list1[list1.length-1]) {
			list2[list2.length-1]=x;
		}
		
		if (x<=list1[0]) {
			list2[0]=x;
		}

		//get index of number higher than x
		int hi=0;
		for (int i = 0; i < list1.length; i++) {
			if (x<=list1[i]) {
				hi = i; //get index of number immediately higher than x
				System.out.println(hi);
				break;
			}else hi=list1.length;
			
			
		}System.out.println(hi);
		
		//get index of number lower than x = 1
		int li=list1.length-1;
		for (int i = list1.length-1; i >0; i--) {
			if (x>list1[i]) {
				li = i; //get index of number immediately higher than x
				System.out.println(li);
				break;
			}else li=0;
			
			
		}System.out.println(li);
		
		
		
		//copy numbers from list1 to list 2 and insert x
		//copy below x
		for (int i = 0; i <list1[li]; i++) {
			list2[i]=list1[i];		
		}
		
		//copy above x
		for (int j= list2.length-1, i=list1.length-1; j >hi; j--, i--) {
			list2[j]=list1[i];
		}
		
		//insert x
		list2[li+1]=x;
		
		System.out.println("original list: " +Arrays.toString(list1));
		System.out.println("list2: " +Arrays.toString(list2));
	}

}
