package Arrays;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Reverse me";
		StringBuilder sb= new StringBuilder();
		sb.append(str);
		sb=sb.reverse();
		System.out.println(sb);
		
//		for (int i = str.length()-1; i >=0; i--) {
//			sb.append(str.charAt(i));		
//		}
//		
//		System.out.println(sb);
		
		String str1 = "Reverse me";
		StringBuilder sb1= new StringBuilder();
		sb1.append(str1);
		sb1=sb1.reverse();
		System.out.println(sb1);
		
	}

}
