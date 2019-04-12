package implementation;

import java.util.List;

public interface StudentDao {
	
	public List<Student> getAllStudent();
	
	public Student getStudent (int rollNo);
	
	public void updateStudent(String name, int rollNo);
	
	public void deleteStudent(String name, int rollNo);
	
	public void addStudent (String name, int rollNo);

}
