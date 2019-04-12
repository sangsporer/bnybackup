package implementation;

public class Student {
	private String name;
	private int rollNo;

	public Student(String name, int rollNo) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setRollNo(rollNo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
