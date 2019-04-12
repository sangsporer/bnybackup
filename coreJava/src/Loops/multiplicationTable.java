package Loops;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// prompt user for outer loop

//	generate 5 subtraction problems
		System.out.println("multiplication for 1");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int k = i * j;

				System.out.println(+i + "x" + j + "=" + k);
			}
			System.out.println("----------------------------------------------------------------");
			System.out.println("multiplcation for " + (i + 1));

		}

		input.close();
	}

}
