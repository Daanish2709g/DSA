//Find a Fixed Point (Value equal to index) in a given array : 
/*Given an array of n distinct integers sorted in ascending order, write a function that 
  returns a Fixed Point in the array, if there is any Fixed Point present in the array,
  it returns -1. Fixed Point in an array is an index i such that arr[i] equals i. 
  Note that integers in the array can be negative. 

Examples: 

Input: arr[] = {-10, -5, 0, 3, 7}
Output: 3
Explanation: arr[3] == 3

Input: arr[] = {0, 2, 5, 8, 17}
Output: 0
Explanation: arr[0] == 0

Input: arr[] = {-10, -5, 3, 4, 7, 9}
Output: -1
Explanation: No Fixed Point
*/
  
// linear search ;
public class Practise{
	public static int linearSearch(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			if(arr[i] == i)
				return i;
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {51, 4, 3, 2, 1, 5};
		int n = arr.length;
		System.out.println("fixed point is : " + linearSearch(arr, n));
		
	}
	
}

Time Complexity: O(n) 
Auxiliary Space: O(1) 

// binary search :
  
/*First check whether middle element is Fixed Point or not. If it is, then return it; otherwise
  if the index of middle + 1 element is less than or equal to the value at the high index,
  then Fixed Point(s) might lie on the right side of the middle point (obviously only 
 if there is a Fixed Point). Similarly, check if the index of middle – 1 element is greater
  than or equal to the value at the low index, then Fixed Point(s) might lie on the left 
  side of the middle point. */

	public class Practise {
	public static int binarysearch(int arr[], int low, int high) {
		if (high >= low ) {
			int mid = low + (high - low) / 2;
			if (mid == arr[mid]) {
				return mid;
			}
			int res = -1;
			if (mid + 1 <= arr[high]) {
				res = binarysearch(arr, (mid + 1), high);
			}
			if (res != -1) {
				return res;
			}
			if (mid - 1 >= arr[low]) {
				return binarysearch(arr, low, (mid-1));
			}
			
			
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,22, 2, 4, 5, 6, 7, 9, 8};
		int n = arr.length;
		System.out.println("Fixed Point is "
                + binarysearch(arr, 0, n - 1));
		
	}
}

//Time Complexity Analysis:
Average Case: O(log n)
Worst Case: O(n)
Best Case: O(1)
Auxiliary Space: O(log n) (As implicit stack is used for recursive calls)
