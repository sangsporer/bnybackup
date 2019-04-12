package Arrays;


import java.util.Scanner;

public class randomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of elements you want in the array: ");
		
		//assigning the length of the array from the user input
		length = scan.nextInt();
		
		//Declaring and creating the array
		int arr[] = new int[length];
		
		//fill the array with random values
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		//for printing those numbers
		for (int i=0; i<arr.length; i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
		}
		
		scan.close();
	}

}
