package testLeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestGenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> list = generateParenthesis(n);
	}
	//×ö¼Ó·¨
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		String s= "";
		dfs(list,s,0,0,n);
		return list;
	}
	public static void dfs(List<String> list,String s,int left,int right,int n) {
		if(left==n&&right==n) {
			list.add(s);
			return;
		}
		if(left<right) {
			return ;
		}
		if(left <n) {
			dfs(list,s+"(",left+1,right,n);
		}
		if(right<n) {
			dfs(list,s+")",left,right+1,n);
		}
	}
//	//×ö¼õ·¨
//	public static List<String> generateParenthesis(int n) {
//		List<String> list = new ArrayList<>();
//		if (n == 0)
//			return list;
//		String s = "";
//		dfs(list, s, n, n);
//		return list;
//	}
//
//	public static void dfs(List<String> list, String s, int left, int right) {
//		// left×óÀ¨ºÅÊ£ÓàÊı
//		// rightÓÒÀ¨ºÅÊ£ÓàÊı
//		if (left == 0 && right == 0) {
//			list.add(s);
//			return;
//		}
//		if (left > right) {
//			return;
//		}
//		if (left > 0) {
//			dfs(list, s + "(", left - 1, right);
//		}
//		if (right > 0) {
//			dfs(list, s + ")", left, right - 1);
//		}
//	}
}
