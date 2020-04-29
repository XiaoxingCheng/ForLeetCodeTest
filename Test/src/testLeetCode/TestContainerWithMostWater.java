package testLeetCode;

public class TestContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 2, 3, 5, 7 };
		int res = maxArea(height);
		System.out.println(res);
	}

	public static int maxArea(int[] height) {
		if (height == null || height.length < 1)
			return 0;
		int maxRes = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			maxRes = Math.max(maxRes, Math.min(height[left], height[right]) * (right - left));
			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxRes;
	}
}
