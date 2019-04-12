package fileHandlerExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import fileHandler.Employee;
import fileHandler.MyFileReader;
import fileHandler.MyFileWriter;

public class Runner2 {

	public static void main(String[] args) {
		 //ask user for user name and password 3 times
		// TODO Auto-generated constructor stub
		
		System.out.println("Please enter your Username");
		
		Scanner input = new Scanner(System.in);
		
		String userInput = input.nextLine();
		
		// read credential file compare user name to user input
		String location = "D:\\Users\\sang.sporer\\eclipse-workspace\\coreJava\\src\\fileHandlerExercise\\Credentials.txt";
		
		HashMap<String, String> bloggers =Reader.fileReader(location);
	
		String password = "";
		
		
		if (bloggers.containsKey(userInput)) {
			password = bloggers.get(userInput);
				System.out.println("User found!");
				
				
				System.out.println("Enter Password");
				String userPass = input.nextLine();
				if(password.equals(userPass)) {
					System.out.println("Right password!");
					//allow user to write to the blog file
					
					System.out.println("Enter your blog");
					String blog = "D:\\Users\\sang.sporer\\eclipse-workspace\\coreJava\\src\\fileHandlerExercise\\Blog.txt";
					String writing = input.nextLine();
					Writer.fileWriter(blog, writing);
				
				
				}else {
					System.out.println("Wrong password!");
				}
				
				
		}else {
			System.out.println("User not found!");
		}
		
	
		
	}


}