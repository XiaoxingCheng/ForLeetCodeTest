package testLeetCode;

public class TestShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 1, 7, 3, 1, 6, 9, 4};
		shellSort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	public static void shellSort(int[] nums) {
		//步长
		int n = nums.length;
		for(int step =n/2;step>0;step/=2) {
			//步长[step,nums.length)
			for(int i = step;i<nums.length;i++) {
				int value = nums[i];
				int j = 0;
				for(j=i-step;j>=0&&nums[j]>value;j-=step) {
					nums[j+step]=nums[j];
				}
				nums[j+step]=value;
			}
		}
	}
}
