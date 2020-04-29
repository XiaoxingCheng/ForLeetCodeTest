package testLeetCode;

import java.util.ArrayList;
import java.util.List;

public class TestCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int res = waysToChange(n);
		System.out.println(res);
	}

	// 一维动态规划
	public static int waysToChange(int n) {
		if (n < 5)
			return 1;
		if (n == 5)
			return 2;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		int[] coins = { 1, 5, 10, 25 };
		for (int coin : coins) {
			for (int i = coin; i <= n; i++) {
				dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
			}
		}
		/*
		 * for (int i = 1; i <= n; i++) { for (int coin : coins) { if (i >= coin) {
		 * dp[i] = (dp[i - 1] + dp[i - coin]) % 1000000007; } else { dp[i] = dp[i - 1];
		 * } } }
		 */
		return dp[n];
	}

	// 二维动态规划
//	public static int waysToChange(int n) {
//		int[] coin = { 1, 5, 10, 25 };
//		int[][] dp = new int[4][n + 1];
//		for (int i = 0; i <= n; i++) {
//			dp[0][i] = 1;
//		}
//		for (int i = 0; i < 4; i++) {
//			dp[i][0] = 1;
//		}
//		for (int i = 1; i < 4; i++) {
//			for (int j = 1; j <= n; j++) {
//				if (j >= coin[i]) {
//					dp[i][j] = (dp[i - 1][j] + dp[i][j - coin[i]]) % 1000000007;
//				} else {
//					dp[i][j] = dp[i - 1][j];
//				}
//			}
//		}
//		return dp[3][n];
//	}
//	public static int waysToChange(int n) {
//		int[] coin = { 1, 5, 10, 25 };
//		List<List<Integer>> res = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
//		if (n < 5)
//			return n;
//		helper(res, list, 0, n, coin);
//		return res.size();
//	}
//
//	public static void helper(List<List<Integer>> res, List<Integer> list, int curIndex, int target, int[] coin) {
//		if (target < 0) {
//			return;
//		}
//		if (target == 0) {
//			List<Integer> tList = new ArrayList<>(list);
//			res.add(tList);
//			return;
//		}
//		for (int i = curIndex; i < coin.length && target >= coin[i]; i++) {
//			list.add(coin[i]);
//			int temp_target = target - coin[i];
//			helper(res, list, i, temp_target, coin);
//			list.remove(list.size() - 1);
//		}
//	}
}
