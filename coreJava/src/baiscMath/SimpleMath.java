package baiscMath;

import java.util.Scanner;

public class SimpleMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num1;
int num2;
int ans;

num1 = 0 + (int) (Math.random() * (10));
num2 = 0 + (int) (Math.random() * (10));
		
Scanner input = new Scanner(System.in);
		
//Ask for questions
System.out.println("What is " + num1 + "+" +num2);
		
//Assign variable to response
ans = input.nextInt();
	
if (ans == num1+num2) {
		System.out.println("Your answer is correct");
		
	}else 
		System.out.println("Try again");
		
		
		
		
		
input.close();		
		
	}

}
