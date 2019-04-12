package fileHandlerExercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import fileHandler.Employee;

public class Writer {

public static void fileWriter(String blog, String writing) {
		
		try {
			File file = new File(blog);
			FileWriter writer = new FileWriter(file, false);// true will append not overwrite, false will overwrite
			
			writer.write(writing);	
			
			
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			
		}
		
	}


}
