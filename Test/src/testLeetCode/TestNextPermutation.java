package testLeetCode;

public class TestNextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 5, 1 };
		nextPermutation(nums);
		for (int i : nums) {
			System.out.println(i);
		}
	}

	// ���⣺����123465������һ��ȫ���У����ҷ���Ҫ��С��
	// �Ƚ�123465���123564���ٶԺ������������
	// ��ô123546������һ������
	public static void nextPermutation(int[] nums) {
		int end = nums.length - 1;
		int i = 0;
		for (i = end; i > 0 && nums[i] <= nums[i - 1]; i--)
			;
		int n = i - 1;
		if (n < 0) {
			quickSort(nums, 0, end);
		} else {
			int j = end;
			// ��Ҫ�Ӻ��潵�������ҵ���i�󣬱�i-1���������
			for (; j >= i && nums[j] <= nums[n] && nums[j] <= nums[i]; j--)
				;
			int temp = nums[j];
			nums[j] = nums[n];
			nums[n] = temp;
			// swap(nums[j], nums[n]);
			quickSort(nums, i, end);
		}
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

	public static void swap(int m, int n) {
		int t = m;
		m = n;
		n = t;
	}
	// ����������
	/*
	 * public static void nextPermutation(int[] nums) { //���������ң����ڵ�һ����
	 * //��������ҵ�һ�����ڵ�һ������������ô����ִ������ //������������ int end = nums.length-1; int start = 1;
	 * if(start<end) { while(start<end&&nums[end]<=nums[0]) { end--; } }
	 * //û�д��ڵ�һ�������� if(start ==end) { quickSort(nums,0,nums.length-1); }else {
	 * quickSort(nums,1,nums.length-1); } } public static void quickSort(int[]
	 * nums,int start,int end) { if(start<end) { int index =
	 * partition(nums,start,end); quickSort(nums,start,index-1);
	 * quickSort(nums,index+1,end); } } public static int partition(int[] nums,int
	 * start,int end) { int t = nums[start]; while(start < end) { while(start
	 * <end&&nums[end]<=t) { end--; } nums[start]=nums[end];
	 * while(start<end&&nums[end]>=t) { start++; } nums[end]=nums[start]; }
	 * nums[start]=t; return start; }
	 */
}
