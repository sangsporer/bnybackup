package Loops;

import java.util.Scanner;

public class repeatAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare 2 numbers to be added
		int number1=2;
		int number2=5;
		int sum=number1+number2;
		
		//initialize scanner
		
		Scanner input = new Scanner(System.in);
		
		//prompt for answer
		
		System.out.println("What is "+number1+ "+" +number2+ "?");
		
		//set response to variable
		
		int answer = input.nextInt();
		
		
		while (answer!=sum) {
			System.out.println("Incorrect, what is "+number1+ "+" +number2+ "?");
			answer=input.nextInt();
		}
		System.out.println("Correct!");
		
		
		
		
		
		
		
		
		
input.close();

	}

}
