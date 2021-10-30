package com.sarkar.algo.recursion;

import java.util.ArrayList;

public class SimpleArraySolutions {

	static boolean isSorted(int[] arr) {
		return isSortedImpl(arr, 0);
	}

	static ArrayList<Integer> isAvailable(int[] arr, int target) {
		return isAvailableImpl(arr, 0, target, new ArrayList<>());
	}

	private static ArrayList<Integer> isAvailableImpl(int[] arr, int i, int target, ArrayList<Integer> list) {

		if (i == arr.length)
			return list;
		if (arr[i] == target) {
			list.add(i);
		}
		return isAvailableImpl(arr, i + 1, target, list);
	}

	private static boolean isSortedImpl(int[] arr, int i) {
		if (i == arr.length - 1)
			return true;
		if (arr[i] > arr[i + 1])
			return false;
		return isSortedImpl(arr, i + 1);
	}

	private static ArrayList<Integer> isAvailable2ndApproach(int[] arr, int target) {
		return isAvailable2ndImpl(arr, 0, target);
	}

	// 2nd Approach - Not very optimised
	private static ArrayList<Integer> isAvailable2ndImpl(int[] arr, int i, int target) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (i == arr.length)
			return list;
		if (arr[i] == target) {
			list.add(i);
		}
		ArrayList<Integer> answersFromBelowCalls = isAvailable2ndImpl(arr, i + 1, target);
		list.addAll(answersFromBelowCalls);
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 9 };
		// int[] arr = { 1, 3, 5, 7, 9, 8 };
		System.out.println(isSorted(arr));
		isAvailable(arr, 9).forEach(System.out::println);
		isAvailable2ndApproach(arr, 9).forEach(System.out::println);
	}

}
