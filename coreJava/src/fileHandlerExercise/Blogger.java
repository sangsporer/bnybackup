package fileHandlerExercise;

import java.util.ArrayList;

import fileHandler.Employee;

public class Blogger {
	
	private String user;
	private String password;
	
	public Blogger(String user, String password) {
		// TODO Auto-generated constructor stub
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
			
	ArrayList <Blogger> blogList = new ArrayList<Blogger>();
	
	
	public String toString() {
		return this.user + " " + this.password;
		
	}

}
