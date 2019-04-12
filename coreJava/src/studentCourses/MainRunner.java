package studentCourses;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MainRunner {
	
	
	public static void main(String[] args) {
		
		
		
		
		Course c1 = new Course(1, "Core Java");
		Course c2 = new Course(2, "Python" );
		Course c3 = new Course(2, "HTML" );
		
		List<Course> li = new ArrayList<Course>();
		li.add(c2);
		li.add(c3);
		
		Student s1 = new Student(1, "Maria", li);
		
		s1.printStudent();	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which course you want to drop?");
		String dropCourse = input.nextLine();
		s1.dropCourse(dropCourse);
		
		s1.printStudent();
		
//		Student s2 = new Student(1, "Maria", new ArrayList<>());
		
		
	}

}
