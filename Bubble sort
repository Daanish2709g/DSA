import java.util.*;

public class Sorting {
    public static void PrintArray(int arr[]) {
        // Corrected loop without the misplaced semicolon
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after printing the array
    }
    
    public static void main(String args[]) {
        int arr[] = {1, 2, 5, 7, 4, 6, 9, 0};
        
        // Bubble sort
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) { // Compare arr[j] and arr[j+1]
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        PrintArray(arr); // Print the sorted array
    }
}
