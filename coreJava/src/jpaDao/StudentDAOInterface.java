package jpaDao;

import java.util.List;

public interface StudentDAOInterface {
	enum SQL{
		GET_ALL_STUDENTS("SELECT * FROM student"),
		GET_STUDENT_BY_ID("SELECT * FROM student WHERE id=?");
		private final String query;
		private SQL(String s) {
			this.query = s;
		}
		public String getQuery() {
			return query;
		}
	}
	
	/**
	 * Queries the databse for all student information
	 * @return List containing all student information as Student objects
	 */
	List<Student> getAllStudents();
	
	/**
	 * Queries database for a specific student's information
	 * Student id specifies the student
	 * @param id The student id being used
	 * @return Student object containing all information relating to the given id
	 */
	
	Student getStudentById(int id);

}
