package sarkar.algo.array;

import java.util.Arrays;

public class MoveZerosOnesTwos {

	public static void sort(int[] nums) {
		int low = 0, mid = 0, temp = 0;
		int high = nums.length - 1;
		while (mid <= high) {
			switch (nums[mid]) {
			case 0: // mid pointer points at zero
			{
				temp = nums[low];
				nums[low++] = nums[mid];
				nums[mid++] = temp;
				break;
			}
			case 1: // mid pointer points at one
			{
				mid++;
				break;
			}
			case 2: // mid pointer points at two
			{
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}

			}
		}
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		//int arr[] = { 0, 0, 1, 2, 0, 1, 2 };
		//int[] arr = { 2,0,2,1,1,0 };
		//int[] arr = {0, 1, 2, 2, 1, 0};
		int[] arr = {0, 1, 2, 1, 2, 1, 2};
		sort012(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void sort012(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[right] < arr[left]) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;

				if (arr[right] == 2) {
					right--;
				} else {
					left++;
				}
			} else {
				left++;
			}
		}
	}

}
