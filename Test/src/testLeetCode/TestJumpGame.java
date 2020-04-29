package testLeetCode;

public class TestJumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1 };
		boolean res = canJump(nums);
		System.out.println(res);
	}
	//贪心实现
	public static boolean canJump(int[] nums) {
		if(nums==null||nums.length==0) return false;
		if(nums.length==1) return true;
		int max = 0;
		for(int i = 0;i<nums.length;i++) {
			if(i<=max) {
				max = Math.max(max, nums[i]+i);
				if(i>=nums.length-1) {
					return true;
				}
			}
		}
		return false;
	}
	//类似思想是贪心算法
//	public static boolean canJump(int[] nums) {
//		if(nums==null||nums.length==0) return false;
//		if(nums.length==1) return true;
//		int max = nums[0];//我感觉人家这个想法特别好
//		//1.当前位置不能到达下一个位置，返回false
//		//2.最大的index能够到达最终
//		for(int i=0;i<nums.length;i++) {
//			if(max<=i&&nums[i]==0) {
//				//当前位置不是最终未知，不能到达下一位置
//				return false;
//			}
//			//当前位置跳跃的值更大
//			//比如当前，max是3，而i=2,nums[i]=3;
//			//则max变成最大的值
//			if(i+nums[i]>=max) {
//				max = i+nums[i];
//			}
//			if(max>=nums.length-1) {
//				return true;
//			}
//		}
//		return false;
//	}
	//超时，不一定就按照当前位置加上当前位置的数跳跃
//	public static boolean canJump(int[] nums) {
//		if (nums == null || nums.length == 0)
//			return false;
//		int len = nums.length;
//		int i = 0;
//		int cur = 0;
//		while (cur < len) {
//			cur = cur + nums[cur];
//			if (cur == len - 1) {
//				return true;
//			}
//		}
//		return false;
//	}

}