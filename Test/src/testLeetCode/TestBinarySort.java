package testLeetCode;

public class TestBinarySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,3,2,1,1,0};
		nums = binarySort(nums);
		System.out.println(nums);
	}
	public static int[] binarySort(int[] nums) {
		for(int i = 1;i<nums.length;i++) {
			int left = 0;
			int right = i-1;
			//这里可以相等，相等的时候再判断一次
			while(left <=right) {
				int mid = (left+right)/2;
				if(nums[mid]>nums[i]) {
					right= mid-1;
				}else {
					left = mid+1;
				}
			}
			int temp = nums[i];
			for(int j = i;j>right+1;j--) {
				nums[j]=nums[j-1];
			}
			nums[right+1]=temp;
		}
		return nums;
	}
}
