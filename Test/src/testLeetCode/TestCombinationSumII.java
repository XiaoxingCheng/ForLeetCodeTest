package testLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> res = combinationSum2(candidates, target);
		for (List<Integer> r : res) {
			System.out.println(r.toString());
		}
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		// Set<List<Integer>> res = new HashSet<>();
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (target == 0)
			return res;
		Arrays.sort(candidates);
		helper(res, list, 0, candidates, target);
		return res;
	}

	public static void helper(List<List<Integer>> res, List<Integer> list, int curIndex, int[] candidates, int target) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			List<Integer> tList = new ArrayList<>(list);
			res.add(tList);
			return;
		}
		for (int i = curIndex; i < candidates.length && target >= candidates[i]; i++) {

			if (i > curIndex && candidates[i] == candidates[i - 1]) {
				continue;
			}

			list.add(candidates[i]);
			int temp_target = target - candidates[i];
			helper(res, list, i + 1, candidates, temp_target);
			list.remove(list.size() - 1);
		}
	}
}
