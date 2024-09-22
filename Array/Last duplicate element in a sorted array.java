// finding the element which dulicated last in a array
public class Practise {
	public static void findDuplicate(int arr[], int n) {
		 
		if (arr == null || n <= 0)
			return;
		
		for (int i = n - 1; i > 0; i--) {
			 
			if ( arr[i] == arr[i-1]) {
				System.out.println("last duplicated item: " + arr[i]);
				return;
			}
			}
	}
	
	public static void main ( String[] args) {
		int arr[] = {1, 2, 3, 4, 555, 555, 555, 666, 66, 7777, 77777, 77};
		int n = arr.length;
		findDuplicate(arr, n);
 }
}

/*
explanation: 
for (int i = n - 1; i > 0; i--):
What is happening here?

This is a for loop, which is used to repeat a set of instructions multiple times.
int i = n - 1:

This means the loop starts with i set to the index of the last element in the array.
n is the length of the array. Since array indices start at 0, the last element is 
  at index n - 1.
For example, if n = 12 (the array has 12 elements), the loop starts at i = 11 because
  arr[11] is the last element.
i > 0:

The loop will continue as long as i is greater than 0.
This condition ensures that the loop doesn't check the first element (arr[0]) because
  we are comparing each element with the one before it (so there's no arr[-1]).
i--:

This means that after each iteration, the value of i is reduced by 1 (decremented). 
  So the loop moves backwards through the array.
Starting at the last element, the loop checks the second-to-last, then the third-to-last,
  and so on.
In summary:
The loop begins at the last element (n - 1), compares elements going backwards, and stops
  when it reaches the second element (i = 1).

2. if (arr[i] == arr[i - 1]):
What is this checking?
Inside the loop, the condition arr[i] == arr[i - 1] checks if the current element 
  (arr[i]) is equal to the previous element (arr[i - 1]).
Why check the previous element?
The goal is to find duplicates in the array, so the program checks if two consecutive 
  elements are the same.
For example:
If arr[5] == arr[4], it means there's a duplicate at position 5 and 4.
What happens if a duplicate is found?
If arr[i] is equal to arr[i - 1], it prints "last duplicated item: " + arr[i].
After printing, the method immediately returns, meaning it stops searching further. 
  This is why it only finds and prints the last duplicate (because the loop is going backwards).

  */
