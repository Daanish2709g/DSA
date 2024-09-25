/*Given an array of integers. All numbers occur twice except one number which occurs once. 
  Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 

Input:  arr[] = {2, 5, 2}
Output: 5

Input:  arr[] = {3}
Output: 3*/
import java.util.*;

public class Practise {
    public static int findSingle(int[] arr) {
        // Iterate over every element
        for (int i = 0; i < arr.length; i++) {
            int count = 0;  // Initialize count for each element

            // Count the frequency of the current element arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If count is 1, return the element
            if (count == 1) {
                return arr[i];
            }
        }

        // If no single element is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};  // Input array
        System.out.println(findSingle(arr));  // Output the single element
    }
}

/*Better Solution – Using Hash Map – O(n) Time and O(n) Space
Traverse all elements and put them in a hash table. Element is used as key 
  and the count of occurrences is used as the value in the hash table. 
Traverse the array again and print the element with count 1 in the hash table. 
This solution works in O(n) time but requires extra space*/

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Practise {
	public static int findSingle(int arr[]) {
		Map < Integer, Integer> freq = new HashMap<>();
		
		for (int num : arr) {
			freq.put(num, freq.getOrDefault(num,  0)+ 1);
			
		}
		for  (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 1, 2, 2, 3};
		System.out.println(findSingle(arr));
	}
}
