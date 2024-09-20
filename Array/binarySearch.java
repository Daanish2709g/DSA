/*Binary search is a search algorithm used to find the position of a target value within a 
  sorted array. It works by repeatedly dividing the search interval in half until
  the target value is found or the interval is empty. The search interval is halved by
  comparing the target element with the middle value of the search space.

Conditions to apply Binary Search Algorithm in a Data Structure
To apply Binary Search algorithm:

The data structure must be sorted.
Access to any element of the data structure should take constant time.
Binary Search Algorithm
Below is the step-by-step algorithm for Binary Search:

Divide the search space into two halves by finding the middle index “mid”. 
Compare the middle element of the search space with the key. 
If the key is found at middle element, the process is terminated.
If the key is not found at middle element, choose which half will be used as the next search space.
If the key is smaller than the middle element, then the left side is used for next search.
If the key is larger than the middle element, then the right side is used for next search.
This process is continued until the key is found or the total search space is exhausted.*/



import java.io.*;

public class Practise {
	public static int binarySearch(int arr[], int x) {
		
		int low =0, high = arr.length -1;
		while (low<= high) {
			int mid = low + (high - low) / 2;
			
			if ( arr[mid] == x) {
				return mid;
			}
			if ( arr[mid] < x) {
				low = mid + 1;
			} else {
				high = mid -1;
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		Practise obj = new Practise();
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = arr.length;
		int x = 7;
		int result = obj.binarySearch(arr, x);
		if ( result == -1) {
			System.out.println("sad");
			
		} else {
			System.out.println("ok " + result);
		}
		
	}
}
