package Arrays;

import java.util.Arrays;

public class deckOfCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//declare deck
		int[] deck = new int[52];
		//initializae cards
		for(int i = 0; i<deck.length; i++) {
			deck[i] = i;
		}
			
		//generate an index j randomly with 0 <= j <=i
		for (int i=deck.length-1; i>0; i--) {
			int j = (int)(Math.random()*(i+1));
//				System.out.println("j " + j);
				
				//swap deck[i] deck[j] - random
				int temp = deck[i];
				deck[i] = deck[j];
				deck[j] = temp;				

		} System.out.println(Arrays.toString(deck));
		
		//d=divisor which is the suit of the card 0=spades, 1=
		//r=remainder that is the number within that suit
		for	(int k=0; k<6; k++) {
			int d=deck[k]/13;
			int r=deck[k]%13;
			
			String num="";
			
			if (r<10&&r>0) {
				num=Integer.toString(r+1);
			} else if (r==10) {
				num="Jack"; 
			}else if (r==11) {
				num="Queen";
			}else if (r==12) {
				num="King"; 
			}else if (r==0) {
				num="Ace";
			}
				
			if(d==0) {
				System.out.println("The card is " +num+ " of Spades");
			}else if (d==1) {
				System.out.println("The card is " +num+ " of Hearts");
			}else if (d==2) {
				System.out.println("The card is " +num+ " of Diamonds");
			}else if(d==3) {
				System.out.println("The card is " +num+ " of Clubs");
			}
		
		}	
		
	}

}
