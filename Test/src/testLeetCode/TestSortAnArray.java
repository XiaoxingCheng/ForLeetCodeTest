package testLeetCode;

public class TestSortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,1,2,0,0};
		nums = sortArray(nums);
		System.out.println(nums);
	}
	public static int[] sortArray(int[] nums) {
		if(nums==null||nums.length<2) return nums;
		int start = 0;
		int end = nums.length-1;
		quickSort(nums,start,end);
		return nums;
	}
	public static void quickSort(int[] nums,int start,int end) {
		if(start<end) {
			int index = partition(nums,start,end);
			quickSort(nums,start,index-1);
			quickSort(nums,index+1,end);
		}
	}
	public static int partition(int[] nums,int left,int right) {
		int temp = nums[left];
		while(left < right) {
			while(left < right &&nums[right]>=temp) {
				right--;
			}
			nums[left]=nums[right];
			while(left <right&&nums[left]<=temp) {
				left++;
			}
			nums[right]=nums[left];
		}
		//ÊàÅ¦ÔªËØ·Åµ½×îÖÕÎ»ÖÃ
		nums[left]=temp;
		return left;
	}
	/*
	 * //Ã°ÅÝÅÅÐò public static int[] sortArray(int[] nums) {
	 * if(nums==null||nums.length<2) return nums; for(int i = 0;i<nums.length-1;i++)
	 * { for(int j =i+1;j<nums.length;j++) { if(nums[i]>nums[j]) { int temp =
	 * nums[i]; nums[i]=nums[j]; nums[j]=temp; } } } return nums; }
	 */

}
