package jpaDao;

public class Student {
	private int id;
	private String email;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	private String fname;
	private String lname;

	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void printStudent () {
		System.out.println("Student with id: " +getId()
			+ ", First name: " +getFname() + ", Last name: " +getLname()+ ", email: " +getEmail());
	}
}
