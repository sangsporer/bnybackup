package animalInheritance;

public class Manager extends Employee{

	Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone); //sending 4 variable to create employee - super class
		// TODO Auto-generated constructor stub
		baseSalary = salary;
	}
	
	void calculateTransportAllowance() {
		double transportAllowance = (15.00/100)*baseSalary;
		System.out.println(transportAllowance);
	}
	

}
