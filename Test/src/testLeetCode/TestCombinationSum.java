package testLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 5 };
		int target = 8;
		List<Integer> res = Arrays.asList(2, 3, 5);
		System.out.println(res.toString());
//		List<List<Integer>> res = combinationSum(candidates, target);
//		for (List<Integer> r : res) {
//			System.out.println(Arrays.toString(r.toArray()));
//		}
	}

//	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//		List<List<Integer>> res = new ArrayList<>();
//		List<Integer> list = new ArrayList<>();
//		if (candidates == null || candidates.length == 0)
//			return res;
//		int curIndex = 0;
//		int len = candidates.length;
//		int tempTarget = target;
//		while (curIndex < len) {
//			if (tempTarget > candidates[curIndex]) {
//				tempTarget -= candidates[curIndex];
//				list.add(candidates[curIndex]);
//			} else if (tempTarget == candidates[curIndex]) {
//				list.add(candidates[curIndex]);
//				res.add(list);
//				list.remove(candidates[curIndex]);
//				list = new ArrayList<>();
//				list.add(candidates[curIndex]);
//				tempTarget = target;
//				tempTarget -= candidates[curIndex];
//				curIndex++;
//			} else {
//				tempTarget = tempTarget + candidates[curIndex];
//				list.remove(list.size() - 1);
//				curIndex++;
//			}
//		}
//		return res;
//	}
}
