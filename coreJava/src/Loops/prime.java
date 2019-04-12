package Loops;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

//number is prime if it can only be divided 1 and itself int x, starts at 2 cuz 0 and 1 not prime numbers, 
//outer loop
//		in

		for (int num = 2, count = 0; count < 20; num++) {
			boolean prime = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					prime = false;
//					System.out.println(num+ " is not a prime number");
					break;
				}
			}
			if (prime == true) {
				System.out.println(num+ " is a prime number");
			count++;
			
			}
		}

		input.close();
	}
	
}
