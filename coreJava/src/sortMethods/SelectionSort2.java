package sortMethods;

import java.util.Arrays;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {5,4,3,2,1};
		
		for (int i = 0; i < list.length; i++) {
			int min=list[i];
			int minI=i;
			for (int j = i+1; j < list.length; j++) {
				if(min>list[j]) {
					min=list[j];
					minI=j;
				}				
			}
			if(minI!=i) {
				list[minI]=list[i];
				list[i]=min;
		}
			
		}System.out.println(Arrays.toString(list));

	}
	
	static void sorter(int[] num) {
		for (int i=0; i<num.length; i++) {
			int minIndex = minFinder(i, num);
			int temp = num[i];
			num[i] = num[minIndex];
			num[minIndex] = temp;
		}
	}
	
	static int minFinder(int startIdx, int[] num) {
		int min = num[startIdx];
		int minIndex = startIdx;
		
		for (int i = startIdx+1; i < num.length; i++) {
			if (min > num[i]) {
				min =  num[i];
				minIndex = i;
			}
		} return minIndex;
	}
}
