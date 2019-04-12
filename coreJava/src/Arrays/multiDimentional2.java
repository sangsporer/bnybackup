package Arrays;

public class multiDimentional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare 2-dimentional array
		
		int[][] numberArr = new int[3][4];
		int x=10;
		int rows = 3;
		int columns = 4;
		int i, j;
		
			for(i=0; i<rows; i++) {
				for(j=0; j<columns; j++) {
					numberArr[i][j]=x;
					x=x+10;
					
					System.out.println(numberArr[i][j]);
				}
				System.out.println("");
			}

	}

}
