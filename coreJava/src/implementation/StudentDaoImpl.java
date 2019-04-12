package implementation;

import java.util.ArrayList;
import java.util.List;

import Arrays.returnMethod;

public class StudentDaoImpl implements StudentDao {
	
	List<Student> students;

	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		
		Student s1 = new Student("Tom", 1);
		Student s2 = new Student("Max", 2);
		Student s3 = new Student("Ellie", 3);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Student getStudent(int rollNo) {
		return students.get(rollNo);
	}
	
	

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void updateStudent(String name, int rollNo) {
		// TODO Auto-generated method stub
		students.get(rollNo).setName(name);
	}

	@Override
	public void deleteStudent(String name, int rollNo) {
		// TODO Auto-generated method stub
		students.remove(students.get(rollNo));
		
	}

	@Override
	public void addStudent(String name, int rollNo) {
		// TODO Auto-generated method stub
		students.add(new Student(name, rollNo));
		
	}
	
	
}
