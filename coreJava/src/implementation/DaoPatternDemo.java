package implementation;

import java.util.Scanner;

public class DaoPatternDemo {

	

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();// can only invoke the method from interface 
		//so create implenetation object from interface
		// TODO Auto-generated method stub
		
		//get all students and print
		System.out.println("=====================List of All Students===========================");
		for (Student student:studentDao.getAllStudent()) {
			System.out.println("Student: " + student.getRollNo() + ". " +student.getName());
		}
		
		//get one student
		System.out.println("What student would you like to see. Enter number");
		Scanner input = new Scanner(System.in);
		int rNum = input.nextInt();
		
//		studentDao.getStudent(rNum);
		System.out.println("The student is: " +studentDao.getStudent(rNum).getRollNo()+ ". "
				+studentDao.getStudent(rNum).getName());
			
		

	}

}
