/*Linear search is a method for searching for an element in a collection of elements. In linear search, 
  each element of the collection is visited one by one in a sequential fashion to find the desired element.
  Linear search is also known as sequential search.

  Algorithm for Linear Search Algorithm:
The algorithm for linear search can be broken down into the following steps:

Start: Begin at the first element of the collection of elements.
Compare: Compare the current element with the desired element.
Found: If the current element is equal to the desired element, return true or index to the current element.
Move: Otherwise, move to the next element in the collection.
Repeat: Repeat steps 2-4 until we have reached the end of collection.
Not found: If the end of the collection is reached without finding the desired element, return that the desired element is not in the array.
How Does Linear Search Algorithm Work?
In Linear Search Algorithm, 

Every element is considered as a potential match for the key and checked for the same.
If any element is found equal to the key, the search is successful and the index of that element is returned.
If no element is found equal to the key, the search yields “No match found”.*/

import java.io.*;
 public class Practise {
	 public static int search(int arr[], int N, int x) {
		for (int i = 0; i<N; i++) {
			if(arr[i] == x)
				return i;
		}
		 
		 return -1;
		 
	 }
	 
	 public static void main(String args[]) {
		 int arr[] = { 1, 2, 3, 4, 5, 6 };
		 int x = 1;
		 
		 int result = search(arr, arr.length, x);
		 
		 if(result == -1) {
			 System.out.println("element is not present in array");
		 } else {
			 System.out.println("ok " + result);
		 }
		 
	 }
 }
  
