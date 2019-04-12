/**
 * 
 */
package week01day04;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class LoanPayment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get input from user
		System.out.println("What is the interest rate?");
		
		//just need this once for initial input
		Scanner input = new Scanner(System.in);
		double monthlyInterestRate = input.nextDouble();
		
		System.out.println("How many years?");
		//Scanner input2 = new Scanner(System.in);
		double numberOfYears = input.nextDouble();
		
		System.out.println("What is the loan amount?");
		//Scanner input3 = new Scanner(System.in);
		double loanAmount = input.nextDouble();
		double d=(Math.pow(1+monthlyInterestRate/100, numberOfYears*12d));
		
		//calculate monthly payment
		double monthlyPayment = (loanAmount*(monthlyInterestRate/100))/
				(1-(1/d));
		
		//calculate total payment
		double totalPayment = monthlyPayment*12*numberOfYears;
		
		//display result
		System.out.printf("The monthly payment on " +loanAmount+ " loan is %.2f ",monthlyPayment);
		System.out.println();
		System.out.printf("The total payment on " +loanAmount+ " loan is %.2f", totalPayment);

	}

}
