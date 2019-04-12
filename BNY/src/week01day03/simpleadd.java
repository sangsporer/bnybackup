/**
 * 
 */
package week01day03;
import java.util.Scanner;
import java.util.Random;

/**
 * @author sang.sporer
 *
 */
public class simpleadd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//generate 2 random numbers

Random rand = new Random();
int n = rand.nextInt(10);

int n2 = rand.nextInt(10);

		
		//Declare variables
//		double number1;
//		double number2;
//		double sum;
		
		
		//Assign input variable to read from keyboard
		Scanner input = new Scanner(System.in);
		
		//Ask for questions
		System.out.println("What is " + n + "+" +n2);
		
		//Assign variable to response
	int answer = input.nextInt();
	
	if (answer == n+n2) {
		System.out.println("Your answer is correct");
		
	}else 
		System.out.println("Try again");
		
//		//Ask for number2
//		System.out.println("Please enter second number: ");
//		//Assign input to number2
//		number2 = input.nextDouble();
//		
//		
//		
//		//Compute sum
//		sum=number1+number2;
//		
//		//Print Result
//		System.out.println("The sum of "+number1+" and "+number2+" is "+ sum+".");
				

	}

}


