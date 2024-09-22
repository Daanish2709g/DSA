/*Naive Approach
The naive approach involves using two nested loops: the outer loop picks each element,
  and the inner loop counts the frequency of the picked element. This method is 
  straightforward but inefficient.*/

public class Practise {
	public static int mostfrequent(int[] arr, int n) {
		
		int maxcount = 0;
		int element_having_max_freq =0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
				count++;
				}
				}
			
			if (count > maxcount) {
				maxcount = count;
				element_having_max_freq = arr[i];
			}
		}
		return element_having_max_freq;
		
	}
	public static void main ( String[] args) {
		int [] arr = {1, 2, 3, 4, 5, 66, 66, 6, 44};
		int n = arr.length;
		System.out.println(mostfrequent(arr, n));
	}
	
}

/*best approach: 
  Using Sorting
This method sorts the array first and then finds the maximum frequency by linearly traversing 
  the sorted array. 
  Sorting brings similar elements next to each other, making frequency counting easier.*/

import java.util.*;
public class Practise {
	static int mostfreq (int arr[], int n) {
		Arrays.sort(arr);
		int max_count =1, res = arr[0];
		int curr_count =1;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i -1]) {
				curr_count++;
			}else {
				curr_count = 1;
			}
			
			if (curr_count > max_count ) {
				max_count = curr_count;
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
/*Given the array: {40, 50, 30, 40, 50, 30, 30}
After sorting, the array becomes: {30, 30, 30, 40, 40, 50, 50}
The program checks each element:
30 appears 3 times, so it becomes the most frequent element.
40 appears 2 times, but it doesn’t exceed the count of 30.
50 appears 2 times, but again, it doesn’t exceed 30.
The most frequent element, 30, is returned.*/




