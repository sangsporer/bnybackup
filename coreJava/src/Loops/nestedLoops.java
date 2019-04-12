package Loops;

import java.util.Scanner;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		//prompt user to answer subtraction problem
		
//	generate 5 subtraction problems
	
	for(int i=0; i<3; i++) {
		for (int j=0; j<5; j++) {
			System.out.println("inner loop");
		}System.out.println("outer loop--------------------");
	}
	
		
		
	input.close();	
	}

}
