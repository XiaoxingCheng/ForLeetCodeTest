package testLeetCode;

public class TestRotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == matrix[i].length - 1) {
					System.out.println(matrix[i][j]);
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
	}

	public static void rotate(int[][] matrix) {
		int len1 = matrix.length;
		int len2 = matrix[0].length;
		int[][] temp = new int[len1][len2];
		int k = 0;
		for (int i = 0; i < len1; i++) {
			int len = len1 - 1;
			while (len >= 0 && k < len2) {
				for (int j = 0; j < len2; j++) {
					temp[i][j] = matrix[len--][k];
				}
			}
			k++;
		}
		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
	}
}
