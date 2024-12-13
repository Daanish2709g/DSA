/*Sliding window problems are computational problems in which a fixed/variable-size window is moved 
  through a data structure, typically an array or string, to efficiently process or analyze 
  the continuous subsets of elements. This technique is used to optimize calculations and find 
  patterns, making it a common approach in algorithm design.

*Steps:

* Initialize a variable sum with value 0 to store the final answer
* Run two loops to find all subarrays
** Simultaneously find the length of the subarray
~*f there is any subarray of size k
~Then find its maximum and minimum element
~Then add that to the sum variable
*In the last print/return value stored in the sum variable*/

public class Practise{
	static int subarr(int[] arr, int N, int K) {
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			int length = 0;
			
			for(int j = i; j<N; j++) {
				length++;
				
				if(length == K) {
					int max = Integer.MIN_VALUE;
					int min = Integer.MAX_VALUE;
					
					for(int m = i; m<= j; m++) {
						max = Math.max(max,arr[m]);
						min = Math.min(min, arr[m]);
					}
					
					sum += max+min;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
        int[] arr = {2, 5, -1, 7, -3, -1, -2};
        int N = arr.length;
        int k = 4;
        System.out.println(subarr(arr, N, k));
    }
}
