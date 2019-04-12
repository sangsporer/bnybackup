/**
 * 
 */
package week01day03;

import java.util.Scanner;

/**
 * @author sang.sporer
 *
 */
public class Shape {
	
	//set attributes of class Shape
	double radius;
	double length;
	double width;
	
	// Constructor
	public Shape (double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get radius from user
		System.out.println("What is the circle radius");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		//create object circle
		Shape circle = new Shape(radius);
		
		//define area
		double area = circle.radius*circle.radius*3.1459;
		
		//display area on console
		System.out.println("The area of this circle is "+area+".");
	}

}
