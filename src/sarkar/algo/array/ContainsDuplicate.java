package sarkar.algo.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(containsDuplicate(nums));

	}

	/*
	public static boolean containsDuplicate(int[] nums) {
		//List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> set = new HashSet<>();
		//return !(set.size() == nums.length);
		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}
	*/
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums) {
			if (set.contains(i)) {
				return true;
			}
			set.add(i);
		}
		return false;
	}

}
