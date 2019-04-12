package fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



import maps.myMap;

public class FileRunner {

	public FileRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String location = "D:\\Users\\sang.sporer\\eclipse-workspace\\coreJava\\src\\fileHandler\\text.txt";
	
		ArrayList<Employee> empList =MyFileReader.fileReader(location);
		
		for(Employee emp : empList) {
			System.out.println(emp.toString());
		}
		
		Employee emp1 = new Employee(004, "Lucy", "San Jose");
		Employee emp2 = new Employee(005, "David", "San Jose");
		Employee emp3 = new Employee(006, "Kevin", "San Jose");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		MyFileWriter.fileWriter(location, empList);
	
		
		

	}

}
