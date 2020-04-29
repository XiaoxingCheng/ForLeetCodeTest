package testLeetCode;

public class TestLongestPalindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbbd";
		String res = longestParlindrome(s);
		System.out.println(res);
	}

	public static String longestParlindrome(String s) {
		if (s == null || s.length() == 0)
			return s;
		String res = null;
		int end = s.length();
		int start = 0;
		int maxLen = 0;
		while (start <= end) {
			String temp = s.substring(start, end);
			if (isParlindrome(temp)) {
				if (temp.length() > maxLen) {
					maxLen = temp.length();
					res = temp;
				}
				start++;
				end = s.length();
			} else {
				end--;
			}
		}
		return res;
	}

	public static boolean isParlindrome(String s) {
		int len = s.length();
		for (int i = 0; i < len / 2; i++) {
			if (s.charAt(i) != s.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
