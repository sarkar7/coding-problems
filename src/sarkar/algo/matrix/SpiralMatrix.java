package sarkar.algo.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		
		int top = 0, left = 0, dir = 0;
		int bottom = matrix.length - 1;
		int right = matrix[0].length - 1;
		
		while (top <= bottom && left <= right) {
			if (dir == 0) {
				for (int i = left; i <= right; i++) {
					res.add(matrix[top][i]);
				}
				top++;
			} else if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					res.add(matrix[i][right]);
				}
				right--;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
					res.add(matrix[bottom][i]);
				}
				bottom--;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					res.add(matrix[i][left]);
				}
				left++;
			}
			dir = (dir + 1) % 4;
		}
		return res;
	}

	public static void main(String[] args) {
		// [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println(spiralOrder(matrix));
	}

}
