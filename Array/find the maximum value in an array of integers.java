public class Practise {
	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i< arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 55};
		int max = findMax(nums);
		System.out.println("Big value: " + max);
	}
}


/*Explanation:
findMax method: This method takes an integer array as input and returns the maximum value in the array.
Initialization: The first element of the array is assumed to be the maximum.
Iteration: The method iterates through the remaining elements of the array, comparing each 
element with the current maximum. If a larger element is found, it becomes the new maximum.
Return: The method returns the final maximum value.
Key points about naive approaches:
Simplicity: Naive approaches are often easier to understand and implement.
Potential inefficiency: They might not be the most efficient solution for large datasets or 
complex problems.
Use cases: They can be useful for prototyping, understanding problem requirements, or when 
performance is not a critical factor.
When to use a naive approach:
For small datasets:
If the dataset is small, the performance difference between a naive approach and an optimized 
one might be negligible.
For educational purposes:
Naive approaches can be helpful for learning the basics of an algorithm or problem-solving 
technique.
As a baseline:
You can use a naive approach to establish a baseline for performance comparison with more 
optimized solutions.*/
