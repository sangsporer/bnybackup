package Loops;

import java.util.Scanner;

public class tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	
	//tuition
	double t = 10000;
	//annual increase
	double i = 1.07;
	
	
//print out the years
	int y=0;
	while(t<=20000) {
		t=t*i;
		 y++;	 	
	}System.out.println("It takes "+y+" years to double the tuition");
		
		input.close();
		
	}

}
