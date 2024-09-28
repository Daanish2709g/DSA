/*Given an increasing sequence a[], we need to find the K-th missing contiguous
element in the increasing sequence which is not present in the sequence.

Examples : 

Input : a[] = {2, 3, 5, 9, 10},   k = 1;
Output : 1
Explanation: Missing are 1,4, 6, 7, 8, 11, … So k-th missing element  is 1


Input : a[] = {1, 2, 3},   k = 2;
Output : 5
Explanation: Missing are 4, 5, 6…. So k-th missing element  is 1


Input : a[] = {2, 3, 5, 9, 10, 11, 12},  k = 4;
Output : 7
Explanation: Missing are 1, 4, 6, 7, 8, 13,…  so k-th missing element is 7*/



public class Practise {
	public static int Kthmissing(int[] arr, int K) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > (K+i)) {
				return K+i;
			}
		}
		return K + arr.length;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5};
		int K = 10;
		System.out.println(Kthmissing(arr, K));
		
	}
}

// output: 13
