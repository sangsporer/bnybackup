package sortMethods;

public class maxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {7,-1,5,-4,-9};
		
		//declaring and initializing a variable to hold eht emax after each interation, assuming the first element is the max for now
		
		int min=arr[0];
		
		//for loop to iterate through the array and sum all elements
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The minimum is: " +min);
			
	}

}
