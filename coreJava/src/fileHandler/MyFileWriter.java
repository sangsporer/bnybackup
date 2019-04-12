package fileHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MyFileWriter {
	
	public static void fileWriter(String location, ArrayList<Employee> empList) {
		
		try {
			File file = new File(location);
			FileWriter writer = new FileWriter(file, false);// true will append not overwrite, false will overwrite
			
			writer.write("ID, Name, City\n");
			
			for(Employee emp : empList){
				writer.write(emp.geteID() + ", ");
				writer.write(emp.geteName() + ", ");
				writer.write(emp.geteCity() + "\n");	
			}
			
			writer.close();
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("File not Found");
		}
		
	}

	

}
