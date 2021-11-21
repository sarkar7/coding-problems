package com.sarkar.algo.array;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		int[] nums1 = { -1,0,0,3,3,3,0,0,0 };
		int[] nums2 = { 1,2,2 };

		merge(nums1, 6, nums2, 3);

		for (int i : nums1) {
			System.out.println(i + " ");
		}

	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = 0, j = 0;

		if (n > 0) {
			while (i < nums1.length && j < n) {
				if (nums1[i] <= nums2[j]) {
					if (nums1[i] == 0) {
						nums1[i++] = nums2[j++];
					} else {
						i++;
					}
				} else if (nums1[i] > nums2[j]) {
					rightShiftByOne(nums2[j], nums1, i);
					j++;
				}
			}
		}
	}

	public static void rightShiftByOne(int val, int[] nums1, int i) {
		for (int j = nums1.length - 1; j > i; j--) {
			if (nums1[j - 1] != 0) {
				nums1[j] = nums1[j - 1];
			}
		}
		nums1[i] = val;
	}

}
