package testLeetCode;

import java.util.ArrayList;
import java.util.List;

public class TestPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> res = permute(nums);
		for (List<Integer> r : res) {
			System.out.println(r.toString());
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return res;
		int n = nums.length;
		boolean[] flag = new boolean[n];
		helper(res, list, nums, 0, flag);
		return res;
	}

	public static void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int curIndex, boolean[] flag) {
		if (curIndex == nums.length) {
			res.add(new ArrayList<>(list));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!flag[i]) {
				flag[i] = true;
				list.add(nums[i]);
				helper(res, list, nums, curIndex + 1, flag);
				list.remove(list.size() - 1);
				flag[i] = false;
			}
		}
	}
}
