package linkedIn;

import java.util.Arrays;

public class TowerOfHanoi {

	public void move(int numberOfDiscs, char from, char to, char inter) {
		if(numberOfDiscs == 1) { // breaking point
			System.out.println("Moving Disc " + numberOfDiscs + " from " + from + " to " + to);
		} else {
		move(numberOfDiscs-1, from, inter, to); //recursive part
		System.out.println("Moving Disc " + numberOfDiscs + " from " + from + " to " +to);
		move(numberOfDiscs-1, inter, to, from);
		}
	}

	public static void main(String[] args) {
		
		TowerOfHanoi toh = new TowerOfHanoi();
		toh.move(5, 'A', 'C', 'B');
		
//		int n = 3;
//		int[] a = {n, n-1, n-2};//3,2,1
//		int[] b	= new int[n];
//		int[] c = new int[n];
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));
//		
//		//move values 3, 2, 1 from a to c using b
//		
//		c[0]=a[n-1];// 1
//		b[0]=a[n-2];//2
//		b[1]=c[0];//1
//		c[0]=a[0];//3
//		a[0]=b[1];//1
//		c[1]=b[0];//2
//		c[2]=a[0];//1
//		
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));
		
		
		// TODO Auto-generated method stub
		
	}

}
