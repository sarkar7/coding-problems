package com.sarkar.algo.array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		System.out.println(removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
	}

	public static int removeDuplicates1(int[] arr) {

		// Marking all the duplicates -500
		int i = 0, j = 1;
		int count = 0;
		while (i < arr.length - 1 && j <= arr.length - 1) {
			if (arr[i] == arr[j]) {
				arr[j] = -500;
				j++;
				count++;
			} else {
				i = j;
				j++;
			}
		}

		int k = 1, l = 2;
		while (k < arr.length - 1 && l <= arr.length - 1) {
			if (arr[k] == arr[l]) {
				l++;
			} else {
				arr[k] = arr[l];
				arr[l] = -500;
				k++;
				l++;
			}
		}

		return arr.length - count;

	}

	// Leetcode Best Solution
	public static int removeDuplicates(int[] A) {
		if (A.length == 0)
			return 0;
		int j = 0;
		for (int i = 0; i < A.length; i++)
			if (A[i] != A[j])
				A[++j] = A[i];
		return ++j;
	}

}
