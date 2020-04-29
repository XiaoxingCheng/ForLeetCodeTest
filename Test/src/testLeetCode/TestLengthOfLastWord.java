package testLeetCode;

public class TestLengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World   ";
		int res = lengthOfLastWord(s);
		System.out.println(res);
	}

	public static int lengthOfLastWord(String s) {
		if (s == null || s.isEmpty())
			return 0;
		s = s.trim();
		int sss = s.lastIndexOf(" ");
		System.out.println(sss);
		int len = s.length() - 1 - s.lastIndexOf(" ");
		return len;
		/*
		 * String[] strs = s.split(" "); int maxLength = 0; for (String str : strs) {
		 * maxLength = str.length(); } return maxLength;
		 */

	}
}
