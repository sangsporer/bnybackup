package hackerrank;

import java.util.Arrays;
import java.util.SortedMap;

import Arrays.initialArray;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=7, t = 11, a=5, b= 15;
		int[] apples = {-2,2,1};
		int[] oranges= {5,-6};
	
		
		 int ctrA=0;
	        for (int i=0; i<apples.length; i++){
	            int x=a+(apples[i]);
	            System.out.println(x);
	            if(x>=s&&x<=t){
	                ctrA++;
	            }
	        }
	        //oranges
	        int ctrO=0;
	        for (int i=0; i<oranges.length; i++){
	            int x=b+oranges[i];
	            System.out.println(x);
	            if(x>=s&&x<=t){
	                ctrO++;
	            }
	        }
	        System.out.println(ctrA);
	        System.out.println(ctrO);
	}

}
