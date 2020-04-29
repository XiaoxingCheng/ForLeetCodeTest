package testLeetCode;

import java.util.HashMap;
import java.util.Map;

public class TestRemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
	public static int removeDuplicates(int[] nums) {
		if(nums==null||nums.length==0) return 0;
		if(nums.length ==1) return 1;
		int i =1,j=1;
		for(;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
				continue;
			}else {
				nums[j++]=nums[i];
			}
		}
		return j;
    }
}
