package sarkar.algo.heap;

// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
				(a, b) -> a.getValue().equals(b.getValue()) 
						? Integer.compare(b.getKey(), a.getKey())
						: Integer.compare(b.getValue(), a.getValue()));

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			queue.offer(entry);
		}

		int[] res = new int[k];
		for (int i = 0; i < k; i++) {
			res[i] = queue.poll().getKey();
		}

		return res;
	}

}
