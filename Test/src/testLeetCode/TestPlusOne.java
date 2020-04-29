package testLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 1, 2 };
		int[] res = plusOne(digits);
		System.out.println(Arrays.toString(res));
	}

	public static int[] plusOne(int[] digits) {
		if (digits == null || digits.length == 0)
			return null;
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			digits[i]++;
			digits[i] = digits[i] % 10;
			if (digits[i] != 0) {
				return digits;
			}
		}
		digits = new int[n + 1];
		digits[0] = 1;
		return digits;
	}
}
