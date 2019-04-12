package Arrays;

import java.util.Arrays;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class hourGlass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//generate and print 6 by 6 table of numbers
		int[][] arr = new int[6][6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] =-5+ (int)(Math.random()*5);
            }
        }
        
        System.out.println(Arrays.deepToString(arr));
        
        //calculate sum of hourglass and to list
			int[][] sumlist=new int[arr.length-1][arr.length-1];
        	int sum;
        	for (int i=1; i<arr.length-1; i++) {
        		for(int j=1; j<arr.length-1; j++) {      
                    sum=arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]
                                                +arr[i][j]
                                    +arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                    sumlist[i][j]=sum;
                    
        			}System.out.println(Arrays.deepToString(sumlist));
                    
            }
        	int i=0;
        	int j=0;
        	int max=sumlist[1][1];
        	for (i = 1; i < sumlist.length; i++) {	
        		for (j = 1; j < sumlist.length; j++) {		
        			if(sumlist[i][j]>max) {
        				max=sumlist[i][j];
        				System.out.println("sumlist length is" +sumlist.length);
        			}
        			
					
				}
				
			}System.out.println("this is the max" +max);
        
			
		
        	
//        	
        

//       	find the max sum from sumlist
//       	for (int i=0; i<sumlist.length-1; i++) {
//    		for(int j=0; j<sumlist.length-1; j++) {
//       		if(sumlist[i][j]>list2[i+1]) {
//       			int temp=list2[i+1];
//       			list2[i+1]=list2[i];
//       			list2[i]=temp;
       		}
			
//		}System.out.println(Arrays.toString(list2));
   	
	
}
