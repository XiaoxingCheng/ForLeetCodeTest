package testLeetCode;

public class TestBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,1,1};
		nums = BubbleSort(nums);
		System.out.println(nums);
	}
	public static int[] BubbleSort(int[] nums) {
		for(int i = 0;i<nums.length-1;i++) {//第一趟排序
			for(int j=nums.length-1;j>i;j--) {//每次把最小的元素换到最初位置
				if(nums[j-1]>nums[j]) {
					int temp = nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
}
