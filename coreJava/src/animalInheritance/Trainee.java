package animalInheritance;

public class Trainee extends Employee{

	Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		// TODO Auto-generated constructor stub
		
		baseSalary = salary;
	}

}
