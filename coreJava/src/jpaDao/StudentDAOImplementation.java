package jpaDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDAOImplementation extends StudentDAOAbstract implements StudentDAOInterface {

	public StudentDAOImplementation() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("finally")
	@Override
	public Student getStudentById(int id) {
		Student student = new Student();
		try {
			this.connect();
			ps = conn.prepareStatement(SQL.GET_STUDENT_BY_ID.getQuery());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				student.setId(rs.getInt(1));
				student.setEmail(rs.getString(2));
				student.setFname(rs.getString(3));
				student.setLname(rs.getString(4));
				
				student.printStudent();
				
			}
		}catch (SQLException e) {e.printStackTrace();}
		finally {
			this.dispose();
			return student;
			
		}
	}
	
	@SuppressWarnings("finally")
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<Student>();
		
		try {
			this.connect();
			ps = conn.prepareStatement(SQL.GET_ALL_STUDENTS.getQuery());
			rs = ps.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setEmail(rs.getString(2));
				student.setFname(rs.getString(3));
				student.setLname(rs.getString(4));
				studentList.add(student);
			}
			
			for (Student student : studentList) {
				student.printStudent();
				
			}
				
	       
        
		
		return studentList;
		}
		catch (SQLException e) {e.printStackTrace();}
		
		finally {
			this.dispose();
			return studentList;
		}
	}
	

}
