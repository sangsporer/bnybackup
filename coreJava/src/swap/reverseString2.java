 package swap;



public class reverseString2 {
	
	public static char[] reverse(char[] list) {
		
		for(int i = 0; i < list.length/2; i++) {
				char temp=list[i];
				list[i]=list[list.length-1-i];
				list[list.length-1-i]=temp;
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myText = "Java Basics";
		char[] chars = myText.toCharArray();
		char[] list2 = reverse(chars);
			
		System.out.println(list2);

	}
}
