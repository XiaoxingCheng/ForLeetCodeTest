package testLeetCode;

public class TestInsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,3,2,1,1,0};
		nums = insertSort(nums);
		System.out.println(nums);
	}
	public static int[] insertSort(int[] nums) {
		int i,j;
		for(i = 1;i<nums.length;i++) {
			int temp = nums[i];
			//找到前i个数可插入的位置
			for(j = i-1;j>=0&&nums[j]>temp;j--) {
				nums[j+1]=nums[j];
			}
			nums[j+1]=temp;
		}
		return nums;
	}

}
