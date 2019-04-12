package Loops;

import Arrays.returnMethod;

public class Fibonacci {
	
	public static int fibTopDown(int n, int[] fib) {
		if(n==0) return 0;
		if(n==1) return 1;
		if (fib[n]!=0) { // check to see if fib[n] is empty(0)
			return fib[n];
		}else {
			fib[n]= fibTopDown(n-1, fib) + fibTopDown(n-2, fib) ;
			return fib[n];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100000;
		int[] fib = new int[n+1];
		System.out.println(fib.length);
		System.out.println(fibTopDown(n, fib));
	}

}
