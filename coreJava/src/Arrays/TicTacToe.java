package Arrays;

import java.util.Scanner;

public class TicTacToe {
	
	static Scanner input = new Scanner(System.in);
	
	public static void print(int[][] tictactoe) {
	for (int i = 0; i < tictactoe.length; i++) {
		for (int j = 0; j < tictactoe.length; j++) {
			System.out.print((char)(tictactoe[i][j]));
		}
		System.out.println("");
		}
	}
	
	//Ask player 1 for input and place in appropriate box
	
	public static void player1(int[][] tictactoe) {	
		
		System.out.println("player 1: Enter a number to place your X ");		
		int X=input.nextInt()+48;
		
		while (!valid(tictactoe, X)) {
			System.out.println("Enter a valid number");
			X=input.nextInt()+48;
		}	
		
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe.length; j++) {
				//if user enters already marked field
				if (X==tictactoe[i][j]) {
					tictactoe[i][j]=88;	
				}
			}
		}print(tictactoe);
	}
	
	//Ask player 2 for input and place in appropriate box
	
	public static void player2(int[][] tictactoe) {
		
		System.out.println("player 2: Enter a number to place your O");
	
		int Y=input.nextInt()+ 48;
		
		while (!valid(tictactoe, Y)) {
			System.out.println("Enter a valid number");
			Y=input.nextInt()+48;
		}
		
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe.length; j++) {
				if (Y==tictactoe[i][j]) {
					tictactoe[i][j]=79;					
				}
			}		
		}print(tictactoe);
	}
	//check if input is valid
	public static boolean valid(int[][] tictactoe, int input) {
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe.length; j++) {
				if(input==tictactoe[i][j]) {
					return true;
				}
			}
		}return false;
	}
	//check for winner
	public static boolean winner(int[][] tictactoe, int XY) {
		//check rows
		for (int i = 0; i < tictactoe.length; i++) {
			int j=0;
			if (tictactoe[i][j]==XY&&tictactoe[i][j+1]==XY&&tictactoe[i][j+2]==XY) {
				return true;
			}	
		}
		//check columns
		int i = 0;
		for (int j = 0; j < tictactoe.length; j++) {
			if (tictactoe[i][j]==XY&&tictactoe[i+1][j]==XY&&tictactoe[i+2][j]==XY) {
				return true;
			}	
		}
		
		//check diagonal
		int j=0;
		if (tictactoe[i][j]==XY&&tictactoe[i+1][j+1]==XY&&tictactoe[i+2][j+2]==XY) {
				return true;
			}	
		if (tictactoe[i+2][j]==XY&&tictactoe[i+1][j+1]==XY&&tictactoe[i][j+2]==XY) {
			return true;
		}				
		return false;
	}
	//if no winner
	public static boolean draw(int[][] tictactoe, int X, int Y) {
		for (int i = 0; i < tictactoe.length; i++) {
			for (int j = 0; j < tictactoe.length; j++) {
				if(tictactoe[i][j]!=X&&tictactoe[i][j]!=Y) {
					return false;
				}			
			}	
		}return true;	
	}
	
	public static void main(String[] args) {
		
//		System.out.println((int)'1'); // 49
//		System.out.println((int)'X'); // 88
//		System.out.println((int)'O'); // 79
		
//		System.out.println((int) '|'); //124
//		System.out.println((int)'='); //45
//		System.out.println((int)' '); //32
		
		
		int[][] tictactoe= {{49,50,51},{52,53,54},{55,56,57}};
		print(tictactoe);
		
		for (int i = 0; i < 5; i++) {	
			player1(tictactoe);
			if(winner(tictactoe, 88)) {
				System.out.println("You Won!!!");
				break;
			}
			if(draw(tictactoe, 88, 79)) {
				System.out.println("Game Over - It's a Draw");
				break;
			}
			player2(tictactoe);
			if (winner(tictactoe, 79)) {
				System.out.println("You Won!!!");
				break;
			}
		
		}	
	}

}
