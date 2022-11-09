package sarkar.algo.matrix;

public class RotateImage {

	public void rotate(int[][] matrix) {
		int length = matrix.length;
		if (length == 1)
			return;

		// in-place transpose
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// in-place reverse
		for (int i = 0; i < length; i++) {
			int start = 0;
			int end = length - 1;
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
