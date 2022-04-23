package com.sarkar.algo.array;

import java.util.Arrays;

public class MoveZerosOnesTwos {

	public static void sort(int[] nums) {
		int low = 0, mid = 0, temp = 0;
		int high = nums.length - 1;
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: // mid pointer points at zero
			{
				temp = nums[low];
				nums[low++] = nums[mid];
				nums[mid++] = temp;
				break;
			}
			case 1: // mid pointer points at one
			{
				mid++;
				break;
			}
			case 2: // mid pointer points at two
			{
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}

			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		//int arr[] = { 0, 0, 1, 2, 0, 1, 2 };
		int arr[] = { 2, 0, 1 };
		sort(arr);
	}

}
