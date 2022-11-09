package sarkar.algo.array;

public class FindTheDuplicateNumber {

	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		fast = nums[0];
		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}

	public static int findDuplicate2(int[] nums) {
		int sum = 0;
		int n = nums.length - 1;
		int nSum = n * (n + 1) / 2;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum - nSum;
	}

	public static void main(String[] args) {

		// int[] arr = { 3, 1, 3, 4, 2 };
		int[] arr = { 1, 3, 4, 2, 2 };
		System.out.println(findDuplicate(arr));
	}

}
