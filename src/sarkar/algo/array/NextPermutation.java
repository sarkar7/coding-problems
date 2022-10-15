package sarkar.algo.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NextPermutation {

    static List<Integer> nextPermutation(int N, int arr[]){

        if (N == 1) return convertToList(arr); // Checking if the array is having only 1 element

        int i = 1;
        int lastPeak = -1;
        while(i < N) {     // Find the last peak
            if (arr[i] > arr[i - 1]) {
                lastPeak = i;
            }
            i++;
        }

        if (lastPeak == -1) { // Check if the array is in descending order
            for (int j = 0; j < N/2; ++j) {
                swap(arr, j, N-j-1);
            }
            return convertToList(arr);
        }

        // Find the element in the range of arr[lastPeak - 1] to arr[lastPeak]
        int index = lastPeak;
        for (int k = lastPeak; k < N; ++k) {
            if (arr[k] > arr[lastPeak-1] && arr[k] < arr[index]) {
                index = k;
            }
        }
        swap(arr, lastPeak-1, index);
        sort(arr, lastPeak, N - 1);

        return convertToList(arr);
    }

    private static void swap(int[] nums, int a, int b) {
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }

    private static void sort(int[] nums, int a, int b) {
        while (a < b) {
            if (nums[a] > nums[b]) {
                swap(nums, a, b);
            }
            a++;
            b--;
        }
    }

    private static List<Integer> convertToList(int[] arr) {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(3, arr).forEach(System.out::print);
    }

}
