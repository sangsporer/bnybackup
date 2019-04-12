/**
 * 
 */
package week01day04;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class Time {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set Time attributes
		int minutes;
	
		//get input from user
		System.out.println("What are the minutes");
		Scanner input = new Scanner(System.in);
		minutes = input.nextInt();

		//calculate hours and minutes from input
		int hours = minutes/60;
		int minutes1 = 229%60;
		
		//display result on console
		System.out.println(+minutes+" minutes equals "
		+ hours +" hours and "+ minutes1 +" minutes.");

	}

}
