package arrays;

public class SwapKthElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 3;

		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (i == k - 1) {
				int temp = arr[i];
				arr[i] = arr[n - k];
				arr[n - k] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
