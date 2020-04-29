package testLeetCode;

public class TestMaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int res = maxSubArray(nums);
		System.out.println(res);
	}

	public static int maxSubArray1(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int len = nums.length;
		int[] dp = new int[len];
		dp[0] = nums[0];
		int res = nums[0];
		for (int i = 1; i < len; i++) {
			dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
			res = Math.max(dp[i], res);
		}
		return res;
	}

	// ºÃ°É£¬ÎÒÏë¸´ÔÓÀ²
	public static int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int sum = 0;
		int res = nums[0];
		for (int num : nums) {
			if (sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
			res = Math.max(sum, res);
		}
		return res;
	}
}
