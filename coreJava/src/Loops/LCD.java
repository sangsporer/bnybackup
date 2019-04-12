package Loops;

import java.util.Scanner;


public class LCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
//	prompt user for first number
	System.out.println("Please enter a number");
	
	int n1 = input.nextInt();
	
System.out.println("Please enter another number?");
	
	int n2 = input.nextInt();
	
	
//	if (n1>n2) {
//		 n=n2;
//	}else n=n1;
	
//how to print out the highest g?
	
	for(int g=2; g<n1||g<n2; g++) {
		 if(n1%g==0&&n2%g==0) {
			 System.out.println(g);
			 break;
		 }	
	}
		
		
	input.close();	
	}

}
