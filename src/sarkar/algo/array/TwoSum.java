package sarkar.algo.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3, 3};
		int[] res = findTwoSum(nums, 6);
		for (int i : res) {
			System.out.println(i);
		}

	}

	private static int[] findTwoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(nums[0], 0);
		for (int i = 1; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				int[] res = {map.get(target - nums[i]), i};
				return res;
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
