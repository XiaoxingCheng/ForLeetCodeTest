package testLeetCode;

public class TestSelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,4,2};
		selectSort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void selectSort(int[] nums) {
		for(int i =0;i<nums.length-1;i++) {
			int min = i;
			for(int j = i+1;j<nums.length;j++) {
				if(nums[min]>nums[j]) {
					min = j;
				}
			}
			if(min !=i) {
				int temp = nums[i];
				nums[i]=nums[min];
				nums[min]=temp;
			}
		}
	}
}
