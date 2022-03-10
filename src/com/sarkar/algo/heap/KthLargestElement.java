package com.sarkar.algo.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static void main(String[] args) {
		int[] nums = { 6, 2, 1, 8, 10, 6, 9, 7, 5 };
		List<Integer> list = new ArrayList<Integer>();
		for (int i : nums) {
			list.add(i);
		}

		System.out.println(findKthLargestNumberUsingMaxHeap(list, 3));
		System.out.println(findKthLargestNumberUsingMinHeap(list, 3));
	}

	private static int findKthLargestNumberUsingMaxHeap(List<Integer> nums, int k) {
		// base case
		if (nums == null || nums.size() < k) {
			System.exit(-1);
		}

		// build a max-heap using the `PriorityQueue` class from all
		// elements in the list
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
		// or pass `Comparator.reverseOrder()`
		pq.addAll(nums);

		// pop from max-heap exactly `k-1` times
		while (--k > 0) {
			pq.poll();
		}

		// return the root of max-heap
		return pq.peek();
	}

	private static int findKthLargestNumberUsingMinHeap(List<Integer> nums, int k) {
		// base case
		if (nums == null || nums.size() < k) {
			System.exit(-1);
		}

		// create a min-heap using the `PriorityQueue` class and insert
		// the first `k` array elements into the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums.subList(0, k));

		// do for remaining array elements
		for (int i = k; i < nums.size(); i++) {
			// if the current element is more than the root of the heap
			if (nums.get(i) > pq.peek()) {
				// replace root with the current element
				pq.poll();
				pq.add(nums.get(i));
			}
		}

		// return the root of min-heap
		return pq.peek();
	}

}
