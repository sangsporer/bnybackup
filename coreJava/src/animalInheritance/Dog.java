package animalInheritance;

public class Dog extends Animal{
	
	
	String name;
	
	boolean isTrained;
	
	//constructor for dog
	
	Dog(int numOfLegs, boolean isPet, String name, boolean isTrained) {
		super(numOfLegs, isPet);
		// TODO Auto-generated constructor stub
		this.name=name;
		this.isTrained=isTrained;	
	}
	
	void walk() {
		System.out.println("subclass: Dog only can walk forward!");
	}
	
	//method is override in the super class - sound - method overriding
	
//	void sound() {
//		System.out.println("subclass: Since I am an animal. I can make sound! Dog barks!");
//	}

	
	

}
