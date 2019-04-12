package Arrays;


import java.util.Arrays;
import java.util.Scanner;






public class airplaneSeatIndex {
	//variable b is the seat that is being booked ie A10
	public static int book(String b, int[][] seats) {
		int r=(int)(b.charAt(0))-65; //variable r is the row index
		int c=(Integer.parseInt(b.substring(1,b.length())))-1;//variable c is the column index
		c=Integer.valueOf(b.substring(1))-1;
		
		seats[r][c]=1; //setting the specified seat - b - as 1
		return 0;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] seats=new int[26][10]; //declare seats on the airplane - 26 rows by 10 columns
		
		Scanner input = new Scanner(System.in);//initialize scanner
		//declare booked seats variable
		String[] bookings=new String[6];
		//ask user for seats that are booked -  1 at a time, currently set for 5
		for (int i=0; i<bookings.length;i++) {
			System.out.print("Please enter seat to book [A-Z][1-10] - ie A10");
			 bookings[i]= input.next(); //initialize bookings array with user input
			}		
		
		for (int i=0; i<bookings.length; i++) { 
			book(bookings[i], seats); //assign value 1 to all the seats in bookings by calling the method book
		}
			System.out.println(Arrays.deepToString(seats));

		//Families having 3 members wants to seat together in adjacent seats but not separated by an aisle.
		//count number so such a seats available
		//declare the variables
		int rows = 26;
		int cols = 10;
		int i, j;
		int count3s=0;
		for (i=0; i<rows; i++) {
			for (j = 0; j < cols-2; j++) {
				if(seats[i][3]==0) { //first scenario if col3 is free, just check seat 0,3,7
					if (j==0||j==3||j==7){
						//{seats 0,1,2 or 345 or 789 must be free to be added to count3s, max is 3 per row
						if (seats[i][j]==0&&seats[i][j+1]==0&&seats[i][j+2]==0) {
							count3s++;
						}
					}
				}else if(seats[i][4]==0) {//if seat 3 is taken, check 0,4,7 such that we don't double count
					if (j==0||j==4||j==7){
						if (seats[i][j]==0&&seats[i][j+1]==0&&seats[i][j+2]==0){
							count3s++;
						}
					}
				}
			}System.out.println("The number of set of 3s is: " +count3s);
		}
		System.out.println("Total number of such seats "+count3s*3);
		input.close();
	}

}
