package testLeetCode;

public class TestQuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 4, 1, 2, 3 };
		quickSort(nums, 0, nums.length - 1);
		System.out.println(nums);
	}

	public static void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int index = partition(nums, left, right);
			quickSort(nums, left, index - 1);
			quickSort(nums, index + 1, right);
		}
	}

	public static int partition(int[] nums, int left, int right) {
		int temp = nums[left];
		while (left < right) {
			while (left < right && nums[right] >= temp) {
				right--;
			}
			nums[left] = nums[right];
			while (left < right && nums[left] <= temp) {
				left++;
			}
			nums[right] = nums[left];
		}
		nums[left] = temp;
		return left;
	}

}
