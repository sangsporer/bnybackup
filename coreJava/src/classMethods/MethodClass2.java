package classMethods;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class MethodClass2 {
	
	public static void main(String arg[]) {
		MethodClass.testStatic();
		
		MethodClass2 mc2 = new MethodClass2();
		
		MethodClass mc = new MethodClass();
		mc.testNonStatic();
		int age = mc.mcAge;
		String name = MethodClass.mcName; //non-static variable only available to that object
		int age2 = MethodClass.mcID; //static variable can be accessed
		
	}

}
