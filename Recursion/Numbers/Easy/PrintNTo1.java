/**
 * print n to 1
 * 
 * time complexity: O(n) 
 * space complexity: O(n)
 */

public class PrintNTo1 {

	private static void print(int n) {

		// base case
		if (n == 1) {
			System.out.println(n);
			return;
		} else {

			// recursive case
			System.out.println(n);
			print(n - 1);
		}
	}

	public static void main(String[] args) {
		print(6);
	}
}