/*Step-by-Step Implementation
Here’s how the algorithm is implemented in code:

Calculate the Expected Sum.
Calculate the Actual Sum from the array.
Subtract the Actual Sum from the Expected Sum to find the missing number.*/

public class Practise{
	public static int missimgNumber(int n, int[] arr) {
		int sum = 0;
		for ( int i = 0; i < n-1; i++) {
			sum += arr[i];
		}
		
		int expectedSum = (n* (n+1)) / 2;
		
		return expectedSum - sum;
	}
	
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 6};
		int n = 6;
		System.out.println(missimgNumber(n, arr));
	}
}
