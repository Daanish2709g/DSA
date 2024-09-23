import java.io.*;

public class Practise{
	public static int INT_MAX = 10000000;
	public static int LeastFreq(int arr[], int n) {
		int mincount = INT_MAX;
		int element_havingminfreq = -1;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j<n; j++) {
				if(arr[i] == arr[j])
					count++;
			}
			if (count < mincount) {
				mincount = count;
				element_havingminfreq = arr[i];
			}
		}
		return element_havingminfreq;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 444, 55, 6666, 1, 2, 3, 9};
		int n = 10;
		System.out.println(LeastFreq(arr, n));
	}
}
/*The program finds the least frequent element in an array by counting how many times each
  element appears and then returning the element with the lowest count.
  If multiple elements have the same lowest frequency, it returns the first one found.*/

  // but A better solution is to do sorting. We first sort the array,
  // then linearly traverse the array


import java.io.*;

public class Practise{
	public static int leasrfreq(int arr[], int n) {
		Arrays.sort(arr);
		
		int min_count = n +1, res = -1;
		int curr_count = 1;
		
		for (int i = 1; i < n; i++) {
			if (arr[i] == arr[i - 1]) {
				curr_count++;
				
			} else {
				if (curr_count < min_count);
				min_count = curr_count;
				res = arr[i-1];
			}
			curr_count = 1;
		}
		
		if ( curr_count < min_count) {
			min_count = curr_count;
			res = arr[n-1];
		}
		return res;
	}
	public static void main(String args[])
    {
        int arr[] = {  };
        int n = arr.length;
        System.out.print(leasrfreq(arr, n));
    }
}


