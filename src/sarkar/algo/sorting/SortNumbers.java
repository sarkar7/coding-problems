package sarkar.algo.sorting;

import java.util.Arrays;

public class SortNumbers {

	static void mergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}

	}

	static void merge(int[] arr, int l, int mid, int h) {
		// Find sizes of two sub-arrays to be merged
		int n1 = mid - l + 1;
		int n2 = h - mid;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[mid + 1 + j];

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-arry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k++] = L[i++];
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k++] = R[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 0, 2, 0, 1, 0, 0, 1 };
		mergeSort(arr, 0, arr.length - 1);
		Arrays.stream(arr).forEach(System.out::print);
	}

}
