package sarkar.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

		// printPascalTriangle(6);
		generate(6);

	}

	private static void printPascalTriangle(int num) {
		int i = 1;
		int[] prevArr = { 1 };
		while (i <= num) {
			int[] tempArr = new int[i++];
			for (int j = 0; j < tempArr.length; j++) {
				if (j == 0 || j == tempArr.length - 1) {
					tempArr[j] = 1;
				} else {
					tempArr[j] = prevArr[j - 1] + prevArr[j];
				}
			}
			prevArr = tempArr;
			System.out.println(Arrays.toString(prevArr));

		}
	}

	public static List<List<Integer>> generate(int numRows) {
		int i = 1;
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> prevArr = new ArrayList<>();
		while (i <= numRows) {
			List<Integer> tempArr = new ArrayList<>();
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i - 1) {
					tempArr.add(1);
				} else {
					tempArr.add(prevArr.get(j - 1) + prevArr.get(j));
				}
			}
			prevArr = tempArr;
			list.add(prevArr);
			i++;
		}
		return list;
	}

}
