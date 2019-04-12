package Arrays;

import java.util.Arrays;

public class countLetterHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//delclare and initialize string
		
		String str="I love Java";
		
		//covert string into char array;
		
		char[] cStr=str.toCharArray();
		
		System.out.println(cStr);
		
		int[] count = new int[cStr.length];
	     for (int i=0; i<cStr.length; i++){
	         for (int j=0; j<cStr.length; j++) {
	             if (cStr[i]==cStr[j])
	                 count[i]++;
	            	 
	         }if(count[i]>2) {
	        	 continue;
	        	 
	         }System.out.println("the letter "+cStr[i]+" occurs " +count[i]+" times"); 
	         
	     }
	    
	        
	         
	         
	     
	     
	}

}
