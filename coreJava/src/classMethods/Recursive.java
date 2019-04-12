package classMethods;

import Arrays.returnMethod;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 25;
//		recFun(num);
//		System.out.println(factorial(num));
		
		int num2=5;
		int res=1;
		for(int i=0;i<5;i++) {
			res=res*(num2+i);
			System.out.println(res);
		}

	}
//	static void recFun(int num) {
//		
//		if(num==0) {
//			System.out.println("Reached 0: "+num);
//		}else {
//			num=num-10;
//			System.out.println(num);
//			recFun(num);
//		}
//		
//		
//	}
	
//	static double factorial(double num) {
//		if(num==0) {
//			return 1;
//		}else {	
//			return (num*factorial(num-1));
//			
//		}
//		
//		
//	}
}
