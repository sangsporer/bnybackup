package sortMethods;


import java.util.Arrays;

public class BubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = {5, 4, 3, 2, 1};
		
		for (int i = 0; i < list.length-1; i++) {
			
		
			for (int j = 0; j < list.length-i-1; j++) {
				if(list[j]>list[j+1]) {
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
			}		
		}System.out.println(Arrays.toString(list));

	}

}
