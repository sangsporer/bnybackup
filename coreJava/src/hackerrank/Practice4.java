package hackerrank;

import java.util.Arrays;
import java.util.SortedMap;

import javax.naming.directory.SearchControls;

import Arrays.initialArray;
import Arrays.returnMethod;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a ={2,4};
		int [] b = {16, 32, 96};
		
        int betCtr = 0; 
        
        // find numbers divisible by both 2 and 4 upto 16
       
        	int lcd = a[a.length-1]; // initial value last number of array a
            while(lcd<=b[0]) { //search until lcd reacheas lowest number in array b
            	for (int i = 0; i < a.length; i++) {
            		if(lcd%a[i]==0) {
                		lcd++;
                		betCtr++;
                		System.out.println(lcd);
                		System.out.println(betCtr);
            	
            	}
            
            	
            }
			
		}
        
//            int j=0;
//            while(j<a.length){
//                if (i%a[j]==0){
//                    betCtr++;  
//                    j++;
//                    }
//            }
           
        
            
   
	        
	

	}

}
