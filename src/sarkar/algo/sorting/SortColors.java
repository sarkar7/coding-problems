package sarkar.algo.sorting;

public class SortColors {

	public static void sortColors(int[] nums) {
		int low = 0, mid = 0, temp = 0;
		int high = nums.length - 1;
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: // mid pointer points at zero
				temp = nums[low];
				nums[low++] = nums[mid];
				nums[mid++] = temp;
				break;

			case 1: // mid pointer points at one
				mid++;
				break;

			case 2: // mid pointer points at two
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;

			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, 2, 1, 1, 0 };
		sortColors(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
