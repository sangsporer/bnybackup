package Loops;

import java.util.Scanner;

public class AdvanceMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// prompt user to answer subtraction problem

//	generate 5 subtraction problems
		int i = 0;
		int correct = 0;
		while (i < 5) {

			int x = 1 + (int) (Math.random() * (10));
			int y = 1 + (int) (Math.random() * (10));

			System.out.println("What is " + x + "-" + y + "?");
			int ans = input.nextInt();

			if (ans == x - y) {
				correct++;

			}i++;
		}System.out.println("number correct is " + correct);

input.close();

	}

}
