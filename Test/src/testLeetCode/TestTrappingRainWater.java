package testLeetCode;

public class TestTrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res = trap(height);
		System.out.println(res);
	}
	//有点不知所措
	public static int trap(int[] height) {
		if(height==null||height.length<2) return 0;
		int res = 0;
		int left = 0;
		int right =height.length-1;
		int maxLeft = 0;
		int maxRight = 0;
		while(left<right) {
			maxLeft = Math.max(maxLeft,height[left]);
			maxRight = Math.max(maxRight, height[right]);
			if(maxLeft < maxRight) {
				res += maxLeft-height[left];
				left++;
			}else {
				res += maxRight-height[right];
				right--;
			}
		}
		return res;
	}
	/*
	 * public static int trap(int[] height) { if(height == null||height.length<2)
	 * return 0; int len = height.length; int[] left = new int[len]; int[] right =
	 * new int[len]; int maxLeft = 0; int maxRight = 0; for(int i = 0;i<len;i++) {
	 * left[i]=maxLeft; maxLeft = Math.max(maxLeft, height[i]); } for(int i =
	 * len-1;i>=0;i--) { right[i]=maxRight; maxRight = Math.max(maxRight,
	 * height[i]); } int res = 0; for(int i = 1;i<len-1;i++) { int t =
	 * Math.min(left[i], right[i]); if(t>=height[i]) { res += t-height[i]; } }
	 * return res; }
	 */
}
