package swap;



public class reverseString {
	
	public static char[] reverse(char[] list) {
		char[] result = new char[list.length];
		
		for(int i = 0, j = result.length-1; 
				i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myText = "I see i and j in my dream";
		char[] chars = myText.toCharArray();
		char[] list2 = reverse(chars);
			
		System.out.println(list2);

	}
}
