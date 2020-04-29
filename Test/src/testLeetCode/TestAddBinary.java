package testLeetCode;

public class TestAddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11";
		String b = "1";
		String res = addBinary(a, b);
		/*
		 * int m = Integer.parseInt(a, 2); int n = Integer.parseInt(b, 2); String res =
		 * Integer.toBinaryString(m + n);
		 */
		System.out.println(res);
	}

	public static String addBinary(String a, String b) {
		int len1 = a.length();
		int len2 = b.length();
		int i = len1 - 1;
		int j = len2 - 1;
		StringBuilder sb = new StringBuilder();
		int t = 0;
		while (i >= 0 || j >= 0) {
			int m = (i >= 0) ? a.charAt(i) - '0' : 0;
			int n = (j >= 0) ? b.charAt(j) - '0' : 0;
			sb.append(m ^ n ^ t);
			if ((m == 1 && n == 1) || ((m == 1 || n == 1) && t == 1)) {
				t = 1;
			} else {
				t = 0;
			}
			i--;
			j--;
		}
		if (t == 1) {
			sb.append(1);
		}
		return sb.reverse().toString();
	}
//	public static String addBinary(String a, String b) {
//		long m = Integer.valueOf(a);
//		long n = Integer.valueOf(b);
//		StringBuilder sb = new StringBuilder();
//		if (m == 0 && n == 0)
//			return sb.append(0).toString();
//		int t = 0;
//		while (m > 0 || n > 0) {
//			long t1 = 0;
//			long t2 = 0;
//			if (m > 0) {
//				t1 = m % 10;
//				m /= 10;
//			}
//			if (n > 0) {
//				t2 = n % 10;
//				n /= 10;
//			}
//			sb.append((int) t1 ^ (int) t2 ^ t);
//			if (t1 == 1 && t2 == 1 || ((t1 == 1 || t2 == 1) && t == 1)) {
//				t = 1;
//			} else {
//				t = 0;
//			}
//		}
//		if (t == 1) {
//			sb.append(1);
//		}
//		return sb.reverse().toString();
//	}
}
