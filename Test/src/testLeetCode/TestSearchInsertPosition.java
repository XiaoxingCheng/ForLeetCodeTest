package testLeetCode;

public class TestSearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,3,5,6};
		int target = 0;
		int res = searchInsert(nums,target);
		System.out.println(res);
	}
	public static int searchInsert(int[] nums,int target) {
		int end = nums.length-1;
		int i = 0;
		for(i = end;i>=0&&nums[i]>=target;i--);
		return i+1;
	}
}
