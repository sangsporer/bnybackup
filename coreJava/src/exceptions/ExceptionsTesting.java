package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the divisor: ");
		
		try{
			
			int number = input.nextInt(); 
			int i = 1/number; // equation that is error proned because taking input from user
			System.out.println("Result is: " +i);
			
			int[] numbers = {1,2,3,4,5};
			System.out.println(numbers[5]);
			
		}catch(ArithmeticException e) { // go for low level errors first
//			e.printStackTrace();
			System.out.println("There was an arithmetic division error occured by 0");
			System.out.println("Please try again");
		}catch(InputMismatchException e) {
//			e.printStackTrace();
			System.out.println("Please Provide a number");
			System.out.println("Please try again");
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("highest index is 4");
		}finally {
			System.out.println("That's it! you tried your best!");
			input.close();
		}
		System.out.println("Outside of try-catch-finally!");
	}

}
