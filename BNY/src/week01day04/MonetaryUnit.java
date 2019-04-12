/**
 * 
 */
package week01day04;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class MonetaryUnit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get input from user in dollars and cents
		System.out.println("Enter your dollar amount in xx.xx format.");
		
		//initiate scanner
		Scanner input = new Scanner(System.in);
		
		//assign variable
		double dollarsCents = input.nextDouble();
		
		//calculate dollar value
		int dollar = (int)dollarsCents;
		
		//calculate cents
		double cents = (dollarsCents - dollar)*100;
		
	    //cent = Math.round(cents);
		
		//calculate # of quarters
		int quarters = (int)cents/25;
		//int quartersI = (int)quarters;
		
		//calculate # 0f dimes
		int dimes = (int)(cents - quarters*25)/10;
		//int dimesI = (int)dimes;
		
		//calculate # of nickels
		int nickels = (int)(cents - quarters*25 - dimes*10)/5;
		//int nickelsI = (int)nickels;
		
		//calculate # of pennies
		double pennies = cents - quarters*25 - dimes*10 - nickels*5;
		//int penniesI = (int)pennies;
	
		
		
		//display value in dollars and coins
		System.out.printf("$"+dollarsCents+ " equals to "+dollar+
				" dollar, "+quarters+" quarters, " +dimes+ " dimes, "
				+nickels+ " nickels and " + Math.round(pennies)+ " pennies.");
	}

}
