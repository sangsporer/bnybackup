package Loops;

import java.util.Scanner;

public class endLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// prompt user to enter numbers to be added
		
		int sum=0;
//		System.out.println("Please enter a number.");
//		int number = input.nextInt();
		int number=0;
		do {
			System.out.println("Please enter another number to add. Enter number 0 to end");
			number = input.nextInt();
			sum=sum+number;
			System.out.println("The sum of the numbers entered is "+sum);
			} 
		while (number!=0);
input.close();
	}
}
		