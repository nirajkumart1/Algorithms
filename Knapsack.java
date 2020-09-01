package knapsack;

public class Knapsack {

	private static int knapSack(int W, int[] wt, int[] val, int n) {
		int[][] t = new int[102][1002];

		for (int row = 0; row < 102; row++) {
			for (int col = 0; col < 1002; col++) {
				t[row][col] = -1;
			}
		}
		
		if (n == 0 || W == 0) {
			return 0;
		}

		if (t[n][W] != -1) {
			return t[n][W];
		}

		if (wt[n - 1] <= W) {
			return t[n][W] = Math.max((val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1)),
					knapSack(W, wt, val, n - 1));
		} else {

			return t[n][W] = knapSack(W, wt, val, n - 1);
		}
	}

	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;

		// System.out.println(t[0][0]);
		System.out.println(knapSack(W, wt, val, n));
	}
}
