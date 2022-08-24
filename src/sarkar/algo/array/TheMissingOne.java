package sarkar.algo.array;

import java.util.Arrays;
import java.util.List;

public class TheMissingOne {

	public static int findMissing(List<Integer> input) {
		int sumOfElements = 0;
		for (Integer x : input) {
			sumOfElements += x;
		}

		int n = input.size() + 1;
		int actualSum = (n * (n + 1)) / 2;

		return actualSum - sumOfElements;
	}

	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		// find sum of all numbers from 1 to n.
		int x1 = 1;
		for (int i = 2; i <= n; i++)
			x1 = x1 ^ i;

		// x2 represents XOR of all values in arr
		int x2 = arr[0];
		for (int i = 1; i < n - 1; i++)
			x2 = x2 ^ arr[i];

		// missing number is the xor of x1 and x2
		return x1 ^ x2;
	}

	public static void main(String[] args) {
		// System.out.println(findMissing(Arrays.asList(3, 7, 1, 2, 8, 4, 5)));
		int[] arr = new int[] { 1, 5, 2, 6, 4 };
		System.out.print("Missing number is: " + findMissingNumber(arr));

	}
}
