import java.util.*;
public class Practise {
	static int mostfreq (int arr[], int n) {
		Arrays.sort(arr);
		int maax_count =1, res = arr[0];
		int curr_count =1;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i -1]) {
				curr_count++;
			}else {
				curr_count = 1;
			}
			
			if (curr_count > maax_count ) {
				maax_count = curr_count;
				res = arr[i - 1];
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		int arr [] = {1, 22, 22, 22, 33 ,33, 33, 44,
				44, 5555, 6, 7, 8, 9, 88, 88};
		int n = arr.length;
		System.out.println(mostfreq(arr, n));
	}
}


/*here Java program finds the most frequent element in an array of integers. It works by first
  sorting the array using Arrays.sort(). Then, it iterates through the sorted array, counting 
  how many times each element occurs consecutively. If the current element's frequency exceeds
  the previous maximum frequency, it updates the most frequent element. After iterating through
  the array, the program returns the element that appeared the most times.

In the example array, the element 22 appears the most (3 times), so the program outputs 22*/
