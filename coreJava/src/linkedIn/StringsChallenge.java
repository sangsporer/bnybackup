package linkedIn;

public class StringsChallenge {

	public static void findNoVowelsConsonants(String s) {
		int vowelCtr = 0;
		int consonantCtr = 0;
		String vowels = "aeiouy";
		String trimLower = (s.toLowerCase()).trim();
		char [] sCharArray = trimLower.toCharArray();
		
		for(char c : sCharArray) {
			if(vowels.indexOf(c) != -1) {
				vowelCtr++;
			}else if (c != ' ') {
				consonantCtr++;
			}
		}
		
		System.out.println("There are " + vowelCtr + " vowels in " + s);
		System.out.println("There are " + consonantCtr + " consonants in " + s);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "HellO";
		String s2 = "there is a quiet Mouse";
		String s3 = "I am happy";
		
		//vowels
		findNoVowelsConsonants(s1);
		findNoVowelsConsonants(s2);
		findNoVowelsConsonants(s3);

	}

}
