package sarkar.patterns.twopointer;

import java.util.Arrays;

public class SumOfThreeValues {

	public static boolean findSumOfThree(int nums[], int target) {
		Arrays.sort(nums);
		int low, high, triples;

		for (int i = 0; i < nums.length - 2; i++) {
			low = i + 1;
			high = nums.length - 1;
			while (low < high) {
				triples = nums[i] + nums[low] + nums[high];
				if (triples == target)
					return true;
				else if (triples < target)
					low++;
				else
					high--;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[][] numsList = { { 3, 7, 1, 2, 8, 4, 5 }, { -1, 2, 1, -4, 5, -3 }, { 2, 3, 4, 1, 7, 9 }, { 1, -1, 0 },
				{ 2, 4, 2, 7, 6, 3, 1 } };

		int[][] testList = { { 10, 20, 21 }, { -8, 0, 7 }, { 8, 10, 20 }, { 1, -1, 0 }, { 8, 11, 15 } };

		for (int i = 0; i < testList.length; i++) {
			System.out.print(i + 1);
			System.out.println(".\tInput array: " + Arrays.toString(numsList[i]));
			for (int j = 0; j < testList[i].length; j++) {
				if (findSumOfThree(numsList[i], testList[i][j])) {
					System.out.println("\tSum for " + testList[i][j] + " exists ");
				} else {
					System.out.println("\tSum for " + testList[i][j] + " does not exist ");
				}
			}
		}
	}

}
