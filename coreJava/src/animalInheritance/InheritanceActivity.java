package animalInheritance;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test case #1 create an instance of Manager class by calling the overloaded constructor
		
		Manager mgr1 = new Manager(126534, "Peter", "Chennai", 237844, 65000.00);
		
		System.out.println("Manager: ");
		mgr1.calculateSalary();
		
		//test case #2 create an instance of Trainee
		
		Trainee tne1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000.00);
		
		System.out.println("Trainee: ");
		tne1.calculateSalary();
		
		//calculate transporation allowance from super class
		System.out.println("Transportation Allowance: super class ");
		tne1.calculateTransportAllowance();
		
		//override transportation allowance in manager class with 15%
		System.out.println("Transportation Allowance: manager class ");
		mgr1.calculateTransportAllowance();

	}

	

}
