package sortMethods;
//java implementation of recursive binary search
public class BiRecursive {
	
	//returns index of key if it is present in arr[],
	//else returns -1
	
	public static int binarySearch(int[] arr, int key, int startIndex, int endIndex) {
		int midIndex = startIndex + (endIndex - startIndex)/2;
		
		if (endIndex <startIndex) {
			return -1;
		}
			
		if (key< arr[midIndex]) {
			return binarySearch(arr, key, startIndex, midIndex - 1);
		}
		
		if (key>arr[midIndex]) {
			return binarySearch(arr, key, midIndex + 1, endIndex);
		}
		
		if (key == arr[midIndex]) {
				return midIndex;
		}
		return -1;
	}
	
	
	//main method to test above
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,10,40, 8, 9, 50};
		int key = 10;
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		int result = binarySearch(arr, key, startIndex, endIndex);
		if (result == -1)
			System.out.println("Element is not present");
		else
			System.out.println("Element found at Index " + result);
	}

}
