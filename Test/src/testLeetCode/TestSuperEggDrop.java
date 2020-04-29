package testLeetCode;

public class TestSuperEggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3, n = 14;
		int res = superEggDrop(k, n);
		System.out.println(res);
	}

	public static int superEggDrop(int K, int N) {
		int[][] dp = new int[N + 1][K + 1];
		int m = 0;
		while (dp[m][K] < N) {
			m++;
			for (int k = 0; k < K; k++) {
				dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1;
			}
		}
		return m;
	}
	/*
	 * public static int binarySort(int x,int y,int[] flag) { int left = 0; int
	 * right = y-1; while(left < right) { int medium = (left+right)/2; if(left <
	 * right &&flag[medium]==0) { return medium; }else
	 * if(left<right&&flag[medium]==1) { left = medium+1; } } }
	 */
}
