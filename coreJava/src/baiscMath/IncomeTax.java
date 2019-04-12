package baiscMath;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

//Ask for questions
		System.out.println("What is your tax status? Enter 0 for single, "
				+ "1 for married filing jointly,  2 for married filing serparately" + "3 for head of household");
		int status = input.nextInt();
		if (status <0 || status >3) {
			System.out.println("Please enter valid status!!!");
		} else {
			System.out.println("What is your income?");
			double income = input.nextDouble();

			double tax = 0.0;

			if (status == 0) {
				if (income < 8350) {
					tax = .10 * income;
					
				} else if (income >= 8351 && income < 33951) {
					tax = .15 * income;
					
				} else if (income >= 33951 && income < 88251) {
					tax = .25 * income;
					
				} else if (income >= 82251 && income < 171551) {
					tax = .28 * income;
					
				} else if (income >= 171551 && income < 372951) {
					tax = .33 * income;
					
				} else if (income >= 372951) {
					tax = .33 * income;
					
				}
			} else if (status == 1) {
				if (income < 16700) {
					tax = .10 * income;
					
				} else if (income >= 16701 && income < 67900) {
					tax = .15 * income;
					
				} else if (income >= 67901 && income < 137050) {
					tax = .25 * income;
					
				} else if (income >= 137051 && income < 208850) {
					tax = .28 * income;
					
				} else if (income >= 208851 && income < 372951) {
					tax = .33 * income;
					
				} else if (income >= 372951) {
					tax = .35 * income;
					
				}

			}

			else if (status == 2) {
				if (income < 8350) {
					tax = .10 * income;
					
				} else if (income >= 8351 && income < 33950) {
					tax = .15 * income;
					
				} else if (income >= 33951 && income < 68525) {
					tax = .25 * income;
					
				} else if (income >= 68526 && income < 104425) {
					tax = .28 * income;
					
				} else if (income >= 104426 && income < 186475) {
					tax = .33 * income;
					
				} else if (income >= 186476) {
					tax = .35 * income;
					
				}

			}

			else if (status == 3) {
				if (income < 11950) {
					tax = .10 * income;
					
				} else if (income >= 11951 && income < 45500) {
					tax = .15 * income;
					
				} else if (income >= 45501 && income < 117450) {
					tax = .25 * income;
					
				} else if (income >= 117451 && income < 190200) {
					tax = .28 * income;
					
				} else if (income >= 190201 && income < 372950) {
					tax = .33 * income;
					
				} else if (income >= 372951) {
					tax = .35 * income;
					
				}

			}

			else {
				System.out.println("wrong status");
			}
			System.out.printf("your tax is $%,.2f",tax);
		}
input.close();
	}
}
