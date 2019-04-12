package animalInheritance;

public class Cat extends Animal {

	boolean canClimb;
	
	Cat(int numOfLegs, boolean isPet, boolean canClimb) {
		super(numOfLegs, isPet);
		// TODO Auto-generated constructor stub
		this.canClimb=canClimb;
	}
	
//	void sound() {
//		System.out.println("Sub-class: I am an animal. I can make sound - Meow");
//	}
	
	void catchMouse() {
		System.out.println("Sub-class: Cat can catch mice");
	}
}
