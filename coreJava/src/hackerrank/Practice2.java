package hackerrank;

import java.util.Arrays;
import java.util.SortedMap;

import Arrays.initialArray;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "07:05:45PM"	;
		String[] s1 = s.split(":");
		
		String am =s1[2].substring(2);
		String ss =s1[2].substring(0,2);
		
//		System.out.println(am);
//		System.out.println(ss);
//		System.out.println(Arrays.toString(s1));
		String s24="";
		
		if(am=="PM") {
			int hh = Integer.parseInt(s1[0]) + 12;	
			 s24= hh+":"+s1[1]+":"+ss;
		} else if(am=="AM") {s24 = s1[0]+":"+s1[1]+":"+ss;}
		
		
		
		System.out.println(s24);
		
		
		

	}

}
