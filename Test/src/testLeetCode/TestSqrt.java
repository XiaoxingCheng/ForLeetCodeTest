package testLeetCode;

public class TestSqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		int res = mySqrt(x);
		System.out.println(res);
	}

	// 牛顿迭代法公式：x(n+1)=xn-f(xn)/f'(xn)
	public static int mySqrt(int x) {
		if (x < 2)
			return x;
		double a = x;
		while (a * a > x) {
			a = (a + x / a) / 2;
		}
		return (int) a;
	}

	// 递归+位运算
//	public static int mySqrt(int x) {
//		if (x < 2)
//			return x;
//
//		int left = mySqrt(x >> 2) << 1;
//		int right = left + 1;
//		return (long) right * right > x ? left : right;
//	}

//	public static int mySqrt(int x) {
//		if (x < 2)
//			return x;
//		int left = 2;
//		long num = 0;
//		int right = x / 2;
//		while (left <= right) {
//			int mid = left + (right - left) / 2;
//			num = mid * mid;
//			if (num > x) {
//				left = mid - 1;
//			} else if (num < x) {
//				right = mid + 1;
//			} else {
//				return mid;
//			}
//		}
//		return right;
//	}
//	public static int mySqrt(int x) {
//		if (x == 0)
//			return 0;
//		if (x == 1)
//			return 1;
//		int i = 2;
//		while ((i * i) <= x) {
//			if ((i * i) == x) {
//				return i;
//			}
//			i++;
//		}
//		return i - 1;
//	}
}
