package interfaceDemo;



public class ConcreteClass implements MyInterface, YourInterface {

	
	
	public void sayHello() {
		System.out.println("Hi, there!");	
		System.out.println("I'm from "+ MyInterface.companyName);	
	}
	
	@Override
	public void shakeHand() {
		System.out.println("Shake hand!!");		
	}
	
	@Override
	public void letsChat() {
		System.out.println("Let's havea coffee and chat!");		
	}
	
	public static void main(String... args) {
		// TODO Auto-generated method stub	
		ConcreteClass concreteClass = new ConcreteClass(); //instance of concrete class
		
		concreteClass.sayHello();
		concreteClass.shakeHand();
		concreteClass.letsChat();
		
//		concreteClass.companyName = "evv"; // final variable can't change
//		MyInterface.companyName = "evv"; // final variable can't change
		
//		MyInterface myInterface = new ConcreteClass();
//		
//		List myList = new ArrayList();
//		
//		ArrayList<ConcreteClass> myList2 = new ArrayList<ConcreteClass>();

	}

	

	

}
