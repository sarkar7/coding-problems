package sarkar.algo.dp;

public class MaxSumOfContiguousSubArray {

	public static int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < nums.length; i++) {
			max_ending_here += nums[i];
			if (max_ending_here > max_so_far) {
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}
		return max_so_far;
	}

	public static void findMaxSumSubArray(int[] arr) {
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		int start = 0, end = 0, s = 0;

		for (int i = 0; i < arr.length; i++) {
			max_ending_here += arr[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
				start = s;
				end = i;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
				s = i + 1;
			}
		}

		System.out.println("Maximum contiguous sum is " + max_so_far);
		System.out.println("Starting index " + start);
		System.out.println("Ending index " + end);
	}

	public static void main(String[] args) {

		int[] arr = { 2, 6, -18, 15, 6, -1 };
		findMaxSumSubArray(arr);

	}

}
