package Arrays;

import java.util.Scanner;

public class initialArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		//if you want ot take 5 numbers for user and store it in an int array
		for(int i=0; i<5; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			arr[i] = scan.nextInt(); // taking user input
		}
		
		//for printing those numbers
		for (int i=0; i<5; i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
			System.out.println( arr);
		}
		
		scan.close();
	}

}
