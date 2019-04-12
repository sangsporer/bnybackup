package swap;

public class InPlaceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1 = "JAVA";
//		String s2 = "JAVA";
//		System.out.println(s1 == s2); //true
//		
//		s1 = s1 + " is fun"; //JAVA is fun
//		System.out.println(s1); //Java is fun
//		System.out.println(s1 == "JAVA is fun"); // false

		
		Integer n1 = 5;
		Integer n2 = 5;
		System.out.println(n1 == n2); //true
		
		n1 = n1 + 5; //10
		System.out.println(n1); //10
		System.out.println(n1 == 10); //n1 is reference not a value
		
		String s1 = "JJava Basics";
		System.out.println(s1.indexOf("J"));

	}

}
