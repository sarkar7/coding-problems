package com.sarkar.algo.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 }; // -1, 0, 1, 2, -1, -4
		for (List<Integer> list : findThreeSum(nums)) {
			System.out.println(list);
		}
	}

	private static List<List<Integer>> findThreeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			int[] res = findTwoSum(nums, i + 1, 0 - nums[i]);
			if (res != null) {
				List<Integer> temp = new ArrayList<>();
				temp.add(nums[i]);
				temp.add(res[0]);
				temp.add(res[1]);
				Collections.sort(temp);
				set.add(temp);

			}
		}
		return new ArrayList<>(set);
	}

	private static int[] findTwoSum(int[] nums, int start, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		if (nums[0] != 0) { // If
			map.put(nums[0], 0);
		}
		for (int i = start; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int[] res = { target - nums[i], nums[i] };
				return res;
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
