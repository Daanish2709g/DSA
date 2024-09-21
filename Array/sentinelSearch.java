/*The basic idea of Sentinel Linear Search is to add an extra element at the end of the array 
  (i.e., the sentinel value) that matches the search key. By doing so, we can avoid the 
  conditional check for the end of the array in the loop and terminate the search early, as 
  soon as we find the sentinel element. This eliminates the need for a separate check for the 
  end of the array, resulting in a slight improvement in the average case performance of the
  algorithm.

Here are the steps for Sentinel Linear Search algorithm:

Initialize the search index variable i to 0.
Set the last element of the array to the search key.
While the search key is not equal to the current element of the array (i.e., arr[i]), increment 
  the search index i.
If i is less than the size of the array or arr[i] is equal to the search key, return the value 
  of i (i.e., the index of the search key in the array).
Otherwise, the search key is not present in the array, so return -1 
  (or any other appropriate value to indicate that the key is not found).
The key benefit of the Sentinel Linear Search algorithm is that it eliminates the need 
  for a separate check for the end of the array, which can improve the average case
  performance of the algorithm. However, it does not improve the worst-case performance, 
which is still O(n) (where n is the size of the array), as we may need to scan the entire 
  array to find the sentinel value. */

public class Practise {
	public static void sentinelSearch(int arr[], int n, int key) {
		
		int last = arr[n - 1];
		
		arr[n - 1] = key;
		int i = 0;
		
		while (arr[i] != key) 
			i++;
		
		arr[n-1] = last;
		
		if ((i < n - 1) || (arr[n - 1] == key)) 
              System.out.println("element is present at index " + i);
		
		else 
			System.out.println("oooh no");
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 999	};
		int n = arr.length;
		int key = 999;
		
		sentinelSearch(arr, n, key);
}
}
