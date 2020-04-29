package testLeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class Test01Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		int[][] res = updateMatrix(matrix);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				if (j == res[i].length - 1) {
					System.out.println(res[i][j]);
				} else {
					System.out.print(res[i][j] + " ");
				}
			}
		}
	}

	public static int[][] updateMatrix(int[][] matrix) {
		Queue<int[]> queue = new LinkedList<>();
		int[] dX = { 1, 0, 0, -1 };
		int[] dY = { 0, 1, -1, 0 };
		int len = matrix.length;
		int len1 = matrix[0].length;
		boolean[][] visited = new boolean[len][len1];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len1; j++) {
				if (matrix[i][j] == 0) {
					queue.offer(new int[] { i, j });
					visited[i][j] = true;
				}
			}
		}
		while (!queue.isEmpty()) {
			int[] t = queue.poll();
			for (int k = 0; k < 4; k++) {
				int x = t[0] + dX[k];
				int y = t[1] + dY[k];
				if (x >= 0 && x < len && y >= 0 && y < len1 && visited[x][y] == false && matrix[x][y] != 0) {
					matrix[x][y] = matrix[t[0]][t[1]] + 1;
					visited[x][y] = true;
					queue.offer(new int[] { x, y });
				}
			}
		}
		return matrix;
	}
}
