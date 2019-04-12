/**
 * 
 */
package week01day04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class SalesTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get value of product of item from user
		System.out.println("What is the value of the product?");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		
		//calculate sales tax
		double salesTax=price*0.08875;
		
		
		//display result on console
		System.out.printf("The sales tax on " +price+ " is %.2f", salesTax);
	
	}

}
