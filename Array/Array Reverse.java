/*Given an array arr[], the task is to reverse the array.
  Reversing an array means rearranging the elements such that the first element
  becomes the last, the second element becomes second last and so on.

Examples:

Input: arr[] = {1, 4, 3, 2, 6, 5}  
Output: {5, 6, 2, 3, 4, 1}
Explanation: The first element 1 moves to last position, the second element 4 moves
  to second-last and so on.


Input: arr[] = {4, 5, 1, 2} 
Output: {2, 1, 5, 4}
Explanation: The first element 4 moves to last position, the second element 5 moves
to second last and so on.
*/

// Approach 1 : 

public class Practise{
	public static void reverseArray(int[] arr) {
		int n = arr.length;
		
		int[] temp = new int[n];
		
		for (int i = 0; i < n; i++) {
			temp[i] = arr[n-i-1];
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = temp[i];
		}
	}
		public static void main(String[] args) {
			int[]arr = {1, 2, 3, 4, 5, 67};
			reverseArray(arr);
			for (int i =0; i<arr.length; i++) {
				System.out.print
				(arr[i]+" ");
			}
		
	}
}


// Approach 2 :


/*[Expected Approach – 1] Using Two Pointers – O(n) Time and O(1) Space
The idea is to maintain two pointers: left and right, such that left points at the 
  eginning of the array and right points to the end of the array. 


While left pointer is less than the right pointer, swap the elements at these two 
positions. After each swap, increment the left pointer and decrement the right pointer 
  to move towards the center of array. This will swap all the elements in the first half 
  with their corresponding element in the second half.*/
  
public class Practise{
	public static void rverseArray(int[] arr) {
		int left = 0, right = arr.length-1;
		
		while (left < right) {
			
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			
			right--;
			
		
		}
	}
		public static void main(String[] args) {
			int arr[] = {1, 2, 3, 4, 5};
			
			rverseArray(arr);
			for (int i = 0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
	}

/* The idea is to iterate over the first half of the array and swap each element with 
its corresponding element from the end. So, while iterating over the first half, any 
  element at index i is swapped with the element at index (n – i – 1).*/

