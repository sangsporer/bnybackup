package Arrays;


import java.util.Scanner;

public class RandAvgSumCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int length;
		Scanner scan = new Scanner(System.in);
//		System.out.print("Please enter the number of elements you want in the array: ");
//		
//		//assigning the length of the array from the user input
//		length = scan.nextInt();
		
		//Declaring and creating the array
		int arr[] = new int[100];
		
		//fill the array with random values
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		//for printing those numbers
		for (int i=0; i<arr.length; i++) {
			System.out.println("Number " + (i+1) + ": " + arr[i]);
		}
		
		double sum=0;
		
		for (int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(i==arr.length-1) {
			double avg = sum/arr.length;
			System.out.println("Avg in each iteration: "+avg);
			}
			
		}
		double average=sum/arr.length;
		System.out.println("sum of the random numbers are: " + sum);
		System.out.println("average of the random numbers are: " + average);
		
		int higher=0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>average) {
				higher++;
			}
		}System.out.println(higher+ " of the random numbers are higher than the average.");
		scan.close();
	}

}
