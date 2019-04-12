package Arrays;

import java.util.Arrays;

public class stringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Math , English , Law";
		String delimiter = ",";
		s = s.replaceAll("\\s+", "");
		String[] sArr = s.split(delimiter);
		
		System.out.println(Arrays.toString(sArr));
	}

}
