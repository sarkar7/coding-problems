package com.sarkar.algo.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {

		int[] nums = { 6, 2, 1, 8, 10, 6, 9, 7, 5 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			list.add(i);
		}

		System.out.println(findKthSmallestNumberUsingMaxHeap(list, 3));
		System.out.println(findKthSmallestNumberUsingMinHeap(list, 3));

	}

	private static int findKthSmallestNumberUsingMaxHeap(List<Integer> nums, int k) {

		if (nums.size() == 0 || nums.size() < k) {
			return -1;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		for (int i : nums) {
			pq.add(i);
			if (pq.size() > k) {
				pq.poll();
			}
		}

		// return the root of max-heap
		return pq.peek();

	}

	private static int findKthSmallestNumberUsingMinHeap(List<Integer> nums, int k) {
		// base case
		if (nums == null || nums.size() < k) {
			System.exit(-1);
		}

		// create an empty min-heap and initialize it with all input elements
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums);

		// pop from min-heap exactly `k-1` times
		while (--k > 0) {
			pq.poll();
		}

		// return the root of min-heap
		return pq.peek();
	}

}
