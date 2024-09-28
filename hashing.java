In data structures,

There are several searching techniques like linear search, binary search, search trees etc.
In these techniques, time taken to search any particular element depends on
the total number of elements.

  Linear Search takes O(n) time to perform the search in unsorted arrays consisting of n elements.
Binary Search takes O(logn) time to perform the search in sorted arrays consisting of n elements.
It takes O(logn) time to perform the search in Binary Search Tree consisting of n elements.

drawbacks: 

As the number of elements increases, time taken to perform the search also increases.
This becomes problematic when total number of elements become too large.

  Hashing in Data structure: 

In data structures,

Hashing is a well-known technique to search any particular element among several elements.
It minimizes the number of comparisons while performing the search.

advantages: 

Hashing is extremely efficient.
The time taken by it to perform the search does not depend upon the total number of elements.
It completes the search with constant time complexity O(1).

  mechanism: 

  in hashing An array data structure called as Hash table is used to store the data items.
Based on the hash key value, data items are inserted into the hash table


  import java.util.Arrays;

public class Main {
    public static int missingNumber(int n, int[] arr)
    {
        // Create hash array of size n+1
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // Edge case handling (though problem guarantees a
        // solution)
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
}
