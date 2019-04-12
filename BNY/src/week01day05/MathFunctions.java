/**
 * 
 */
package week01day05;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class MathFunctions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double rint = Math.rint(3.4999999999);
		System.out.println(+rint);
		
		char c=97;
		
		System.out.println(c);
		
		if(Character.isDigit('8')) {
			System.out.println("This is a digit.");
		}else {
				System.out.println("Not a digit");
		}

		String s = "  Bob is a boy  ";
		String s1 = "living in NYC";
		
		//trim
		//System.out.println(s.trim());
		
		//concat
		//System.out.println(s.concat(s1));
		
		//charAt
		//System.out.println(s.charAt(4));
		
		//length
		//System.out.println(s.length());
		
		//convert strings
		//System.out.println("TEST".toLowerCase());
		
		System.out.println("Enter: ");
		Scanner input = new Scanner(System.in);
		
		String s4 = input.nextLine();
		String s2 = input.next();
		String s3 = input.next();
		
		
		System.out.println(s4);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		

		
		
		
	}

}
