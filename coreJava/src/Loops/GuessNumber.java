package Loops;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int rand;

rand = 1+(int)(Math.random() * (100));

System.out.println(rand);
		
Scanner input = new Scanner(System.in);
		
//Ask for guess
System.out.println("Guess a Number between 0 and 100");
		
//Assign variable to response
int guess = input.nextInt();
	
while (guess != rand) {
	if (guess>rand) {
		System.out.println("Your guess is too high. Guess a lower number");	
		guess = input.nextInt();
	}else if(guess<rand) {
		System.out.println("Your guess is too low. Guess a higher number");	
	guess = input.nextInt();
	}
}
System.out.println("Your guessed correct!");
		
		
		
	input.close();	
		
		
	}

}
