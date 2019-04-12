package Arrays;

import java.util.Arrays;

public class Method {
	
	public static void myMethod(int x, int [] y) {
		
		System.out.println("Number: " +x);
		System.out.println("Numbers: " +Arrays.toString(y));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 5;
		int []numbers = {1,2,3,4,5};
		
		System.out.println("This is the main method");
		System.out.println("Number: "+number);
		System.out.println("Numbers: "+Arrays.toString(numbers));
		

	}

}
