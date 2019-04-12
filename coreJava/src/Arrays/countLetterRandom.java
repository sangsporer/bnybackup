package Arrays;

import java.util.Arrays;

public class countLetterRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	find out ascii that corresponds to letter a and z;
		
		System.out.println((int)'a');
		System.out.println((int)'z');
		
		//a is 97 and z is 122. generate 100 random from 97 to 122;
	
		char[] characters = new char[20];
		for(int i=0; i<characters.length; i++) {
			//double x = (int)(Math.random()*((max-min)+1))+min;
			//Random r = new Random(); using random random class
		    //return r.nextInt((max - min) + 1) + min;
			characters[i]=(char)((int)(Math.random()*25+1)+97);
			
		}System.out.println(Arrays.toString(characters));
		int[] repeats = new int[characters.length];
	     for (int i=0; i<characters.length; i++){
	         for (int j=0; j<characters.length; j++) {
	             if (characters[i]==characters[j])
	                 repeats[i]++;
	         }System.out.println("the letter "+characters[i]+" occurs " +repeats[i]+" times");
	     }
	     
	}

}
