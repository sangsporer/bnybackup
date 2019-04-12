/**
 * 
 */
package week01day03;
import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class ComputeArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare variables
		double number1;
		double number2;
		double sum;
		byte numb=127;
		
		
		//Assign input variable to read from keyboard
		Scanner input = new Scanner(System.in);
		
		//Ask for number1
		System.out.println("Please enter first number: ");
		//Assign input to number1
		number1 = input.nextDouble();
		
		//Ask for number2
		System.out.println("Please enter second number: ");
		//Assign input to number2
		number2 = input.nextDouble();
		
		
		
		//Compute sum
		sum=number1+number2;
		
		//Print Result
		System.out.println("The sum of "+number1+" and "+number2+" is "+ sum+".");
				

	}

}


