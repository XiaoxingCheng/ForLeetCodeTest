package testLeetCode;

import java.util.HashSet;
import java.util.Set;

public class TestValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { '8', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		boolean flag = isValidSudoku(board);
		System.out.println(flag);
	}

//	public static boolean isValidSudoku(char[][] board) {
//		Set<Character> set = new HashSet<>();
//		int len1 = board.length;
//		int len2 = board[0].length;
//		for (int i = 0; i < len1; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				if (board[i][j] == '.') {
//					continue;
//				}
//				if (!set.contains(board[i][j])) {
//					set.add(board[i][j]);
//				} else {
//					return false;
//				}
//			}
//			set.clear();
//		}
//		for (int j = 0; j < len2; j++) {
//			for (int i = 0; i < len1; i++) {
//				if (board[i][j] == '.') {
//					continue;
//				}
//				if (!set.contains(board[i][j])) {
//					set.add(board[i][j]);
//				} else {
//					return false;
//				}
//			}
//			set.clear();
//		}
//		for (int k = 0; k < len1; k++) {
//			for (int i = k / 3 * 3; i < k / 3 * 3 + 3; i++) {
//				for (int j = k % 3 * 3; j < k % 3 * 3 + 3; j++) {
//					if (board[i][j] == '.') {
//						continue;
//					}
//					if (!set.contains(board[i][j])) {
//						set.add(board[i][j]);
//					} else {
//						return false;
//					}
//				}
//			}
//			set.clear();
//		}
//		return true;
//	}
	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			// hori, veti, sqre分别表示行、列、小宫
			int hori = 0, veti = 0, sqre = 0;
			for (int j = 0; j < 9; j++) {
				// 由于传入为char，需要转换为int，减48
				int h = board[i][j] - 48;
				int v = board[j][i] - 48;
				int m = 3 * (i / 3) + j / 3;
				int n = 3 * (i % 3) + j % 3;
				int s = board[m][n] - 48;
				// '.'的ASCII码为46，故小于0代表着当前符号位'.'，不用讨论
				if (h > 0) {
					hori = sodokuer(h, hori);
				}
				if (v > 0) {
					veti = sodokuer(v, veti);
				}
				if (s > 0) {
					sqre = sodokuer(s, sqre);
				}
				if (hori == -1 || veti == -1 || sqre == -1) {
					return false;
				}
			}
		}
		return true;
	}

	private static int sodokuer(int n, int val) {
//		int t = val >> n;
//		int m = t & 1;
//		int p = 1 << n;
//		int r = val ^ (1 << n);
		return ((val >> n) & 1) == 1 ? -1 : val ^ (1 << n);
	}
}
