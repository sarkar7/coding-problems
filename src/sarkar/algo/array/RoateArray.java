package sarkar.algo.array;

public class RoateArray {

	public static void rotate(int[] nums, int k) {
		if (nums.length == 1)
			return;

		while (k > 0) {
			int first = nums[0];
			int last = nums[nums.length - 1];
			for (int i = nums.length - 2; i > 0; i--) {
				nums[i + 1] = nums[i];
			}
			nums[0] = last;
			nums[1] = first;
			k--;
		}
	}

	public static void main(String[] args) {

	}

}
