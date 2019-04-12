package animalInheritance;

public class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeephone;
	double baseSalary;
	double specialAllowance = 250.80;
	double Hra = 1000.50;
	
// overloaded constructor
	Employee(long Id, String Name, String address, long phone) {
		// TODO Auto-generated constructor stub
		employeeId = Id;
		employeeName = Name;
		employeeAddress = address;
		employeephone = phone;
	}
	
	void calculateSalary() { // method to calculate salary
		double salary = baseSalary + (baseSalary * specialAllowance/100) + (baseSalary*Hra/100);
		System.out.println("Salary is: " +salary);		
	}
	
	//add a method called calculateTransportAllowance in Employee
	
	void calculateTransportAllowance() {
		double transportAllowance = (10.00/100.00)*baseSalary;
		System.out.println(transportAllowance);
	}
}
