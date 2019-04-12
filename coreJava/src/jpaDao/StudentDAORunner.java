package jpaDao;

import implementation.StudentDao;
import implementation.StudentDaoImpl;
import oracle.net.aso.s;

public class StudentDAORunner {

	public StudentDAORunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAOImplementation studentImp = new StudentDAOImplementation();
		
		studentImp.getStudentById(10);
		
		studentImp.getAllStudents();
	}

}
