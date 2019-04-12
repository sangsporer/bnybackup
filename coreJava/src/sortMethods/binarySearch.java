package sortMethods;
//java implementation of iterative binary search
public class binarySearch {
	
	//returns index of key if it is present in arr[],
	//else returns -1
	
	public static int binarySearch(int[] arr, int key) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while (startIndex <=endIndex) {
			int midIndex = (startIndex + endIndex)/2;
			
			//check if x is preset at mid
			if (arr[midIndex] == key) {
				return midIndex;
			}	
			// if x greater, ignore left half
			if (arr[midIndex] < key) {
			startIndex = midIndex + 1;
			}
			//if x is smaller, ignore right half
			else {
				endIndex = midIndex - 1;
			}
		}
		// if we reach here, then element was not present
		return -1;
	}
	
	
	//main method to test above
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,9,10,12,13,40,50};
		int key = 40;
		int result = binarySearch(arr, key);
		if (result == -1)
			System.out.println("Element is not present");
		else
			System.out.println("Element found at Index " + result);
	}

}
