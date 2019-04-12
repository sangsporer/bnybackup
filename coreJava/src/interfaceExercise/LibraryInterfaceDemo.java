package interfaceExercise;


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers kidUser1 = new KidUsers();
		KidUsers kidUser2 = new KidUsers();
		kidUser1.age = 10;
		kidUser2.age = 18;
		
		
		System.out.println("Test case #1 for KidUser Class");
		System.out.println("RegisterAccount Method for Child Class");
		kidUser1.registerAccount();
		kidUser2.registerAccount();
		System.out.println("");
		
		
		kidUser1.bookType = "Kids";
		kidUser2.bookType = "Fiction";
		
		System.out.println("RequestBook Method for child class");
		kidUser1.requestBook();
		kidUser2.requestBook();
		System.out.println("");
		
		
		System.out.println("Test case #2 for AdultUser Class");
		AdultUser adultUser1 = new AdultUser();
		AdultUser adultUser2 = new AdultUser();
		adultUser1.age = 5;
		adultUser1.age = 23;
		
		System.out.println("Register Adults");
		adultUser1.registerAccount();
		adultUser2.registerAccount();
		System.out.println("");
		
		
		adultUser1.bookType = "Kids";
		adultUser2.bookType = "Fiction";
		System.out.println("Request Book Adults");
		adultUser1.requestBook();
		adultUser2.requestBook();
		
	}

}
