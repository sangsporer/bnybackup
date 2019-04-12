package baiscMath;


import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);


		// ask user to enter a year
		System.out.println("Enter year in form YYYY?");
		
		
		//analyze user input
		int year;	
		year = input.nextInt();
		int year2 = year%12;
		System.out.println(year2);
		
		
		switch(year2){
			case 0: System.out.println("The year " +year+ " is monkey"); break;
			case 1: System.out.println("The year " +year+ " is rooster");	break;
			case 2: System.out.println("The year " +year+ " is dog"); break;
			case 3: System.out.println("The year " +year+ " is pig");	break;
			case 4: System.out.println("The year " +year+ " is rat"); break;
			case 5: System.out.println("The year " +year+ " is ox");	break;
			case 6: System.out.println("The year " +year+ " is tiger"); break;
			case 7: System.out.println("The year " +year+ " is rabbit");	break;
			case 8: System.out.println("The year " +year+ " is dragon");break;
			case 9: System.out.println("The year " +year+ " is snake");	break;
			case 10: System.out.println("The year " +year+ " is horse");break;
			case 11: System.out.println("The year " +year+ " is sheep");	break;
		}
		input.close();
	}

}
