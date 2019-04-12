package fileHandlerExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import fileHandler.Employee;

public class Reader {
	
	public static HashMap<String, String> fileReader(String location){

		
		HashMap<String, String> bloggers = new HashMap<String, String>();
	
		try { // in case java can't file file
		
		
			File file = new File(location);
			Scanner input = new Scanner(file);
			
			input.nextLine();
			String line;
			while(input.hasNextLine()) {
				line = input.nextLine();
				if(!line.equals("")) {
				String[] lineArr = line.split(",");
				bloggers.put(lineArr[0], lineArr[1]);
				}
			}
	
		} catch (FileNotFoundException e) {
			System.out.println("File not Found!");
		}
		
		return bloggers;

	}
}
