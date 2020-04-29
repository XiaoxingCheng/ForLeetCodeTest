package testLeetCode;

import java.util.Stack;

public class TestMaximumNestingDepthOfTwoValidParenthsesStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seq =  "()(())()";
		int[] res = maxDepthAfterSplit(seq);
		System.out.println(res);
	}
	public static int[] maxDepthAfterSplit(String seq) {
		 if(seq==null||seq.isEmpty()) return new int[0];
		 Stack<Integer> s = new Stack<>();
		 int[] res = new int[seq.length()];
		 for(int i = 0;i<seq.length();i++) {
			 if(seq.charAt(i)=='(') {
				 s.push(i);
			 }else {
				 int depth = s.size();
				 int left = s.pop();
				 if(depth%2==0) {
					 res[left]=1;
					 res[i]=1;
				 }
			 }
		 }
		 return res;
	}
}
