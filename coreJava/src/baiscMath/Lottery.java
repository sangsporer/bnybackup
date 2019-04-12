package baiscMath;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);



		// Obtain a number between [0 - 99].
//		int number = rand.nextInt(99);
		int number = 10 + (int)(Math.random() * 90);
		
		int s = number%10;
		int t = +(number-s)/10;
		
		System.out.println(number);

		// ask user for 2 digit number
		System.out.println("Enter a 2 digit number?");
		
		
		//analyze user input
		int response;
		
		
		response = input.nextInt();
		
		int s2=response%10;
		int t2=(response-s2)/10;
		
		
		while (response>99||response<=10) {
				System.out.println("please enter a 2 digit number");
				
				input.nextLine();
				response = input.nextInt();
//				continue;
		}
		
	
		
		
		if (number==response){
			System.out.println("You've won $10,000 " +number);
			
		}else if (s==t2&&t==s2) {
			System.out.println("You've won $3,000 " +number);
		}else if (s2==s||s2==t||t2==s||t2==t) {
			System.out.println("You've won $1,000 " +number);
		}else 
			System.out.println("sorry, try again " +number);
		input.close();
	}

}
