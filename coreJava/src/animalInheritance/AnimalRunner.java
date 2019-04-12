package animalInheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal(4, false);
		
		a1.getSound();
		a1.gotLife();

		Dog dog1 = new Dog(4, true, "Biscuit", false); //also can do Animal dog1 = new Dog
														//but not Dog dog1 = new Animal
		System.out.println("Dog: ");
		dog1.gotLife();
		dog1.getSound();
		dog1.walk();
		
		Cat cat1 = new Cat(4, true, true);
		System.out.println("Cat: ");
		cat1.catchMouse();
		cat1.gotLife();
		cat1.getSound();
		
	}

}
