package fileHandler;

import java.util.ArrayList;

public class Employee {
	
	private int eID;
	private String eName;
	private String eCity;

	public Employee(int eID, String eName, String eCity) {
		// TODO Auto-generated constructor stu
		
			this.eID = eID;
			this.eName = eName;
			this.eCity = eCity;
			
		}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
	ArrayList <Employee> empList = new ArrayList<Employee>();
	
	public String toString() {
		return this.eID + " " + this.eName + " " + this.eCity;
		
	}
	
	

}
