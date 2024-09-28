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
