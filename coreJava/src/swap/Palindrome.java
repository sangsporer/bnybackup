package swap;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] p = {"madam", "wow", "mom", "cat", "dog", "pop", "mam", "hello"};
		
		int palcount=0;
		
		for (int i = 0; i < p.length; i++) {	
			
			int n=p[i].length();
			String s="true";
			StringBuilder sb = new StringBuilder();
			sb.append(s);
			
			System.out.println(sb);
			sb.reverse();
			
			System.out.println(sb);
			if (s.equals(sb.reverse())) {
			    	 System.out.println("true");
			         
			         
				} else System.out.println("false");
			}
	
//        }System.out.println("There are " +palcount+ " palidromes in this list");

	}

}
