package studentCourses;

import java.util.List;

public class Student {
	
	int sId;
	String sName;
	List<Course> sCourses;
	
	Student(int sId, String sName, List<Course> sCourses){
		this.sId=sId;
		this.sName=sName;
		this.sCourses=sCourses;
	}
	
	//create a method to print these
	
	void printStudent(){
			System.out.println(sId);
			System.out.println(sName);
			for (Course course : sCourses) {
				System.out.println(course.cName);		
			}
	}
	
	void dropCourse(String dropCourse) {
		for (int i=0; i<sCourses.size(); i++) {
			System.out.println("for: "+sCourses.get(i).cName);
			if (sCourses.get(i).cName.contentEquals(dropCourse)) {
				sCourses.remove(sCourses.get(i));
				break;
			}else {
				System.out.println("The course you're trying to drop is not your list\"");
			}
		}
	}
	
	

}
