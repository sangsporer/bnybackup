/**
 * 
 */
package week01day04;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//get input from user
				System.out.println("What is the temperature in farenheit?");
				Scanner input = new Scanner(System.in);
				double fahrenheit = input.nextDouble();
				
		//calculate celcius
				double celsius=(5d/9)*(fahrenheit-32.0);
				
		//display result on console
				System.out.println(+fahrenheit+" fahrenheit degrees equals "
				+ celsius +" degrees in celsius.");

				int b=50;
				byte c=2;
				b=b*c;
				b*=c;
				
				b=(byte)(b*2);
				
	}

}
