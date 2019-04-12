package animalInheritance;

public class Animal {
	
	int numOfLegs;
	
	boolean isPet;
	
	//constructor
	Animal (int numOfLegs, boolean isPet){
		this.numOfLegs =numOfLegs;
		this.isPet = isPet;
	}
	
	//method not returning anything - just needs return type and name to start
	private static void sound () {
		System.out.println("I'm super class. Since I am an animal, I can make sound!");
	}
	
	//get sound that is private
	
	public void getSound() {
		sound();
	}
	
	void gotLife () {
		System.out.println("I'm super class. Since I am an animal, I am alive");
	}
	
	

}
