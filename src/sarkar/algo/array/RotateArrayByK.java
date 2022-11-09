package sarkar.algo.array;

import java.util.Arrays;

public class RotateArrayByK {

    //Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArrSwap(int[] arr, int d, int n) {
        int temp = arr[0];
        while (d > 0) {
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = temp;
            temp = arr[0];
            d--;
        }
    }

    static void rotateArr(int[] arr, int d, int n) {
        int temp[] = new int[d];

        for(int i = 0; i  < d; i++) {
            temp[i] = arr[i];
        }

        for(int i = d; i  < n; i++) {
            arr[i - d] = arr[i];
        }

        for(int i = 0; i  < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    
    
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    


    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {40,13,27,87,95,40,96,71,35,79,68,2,98,3,18,93,53,57,2,81,87,42,66,90,45,20,41,30,32,18,98,72,82,76,10,28,68,57,98,54,87,66,7,84,20,25,29,72,33,30,4,20,71,69,9,16,41,50,97,24,19,46,47,52,22,56,80,89,65,29,42,51,94,1,35,65,25};
        int d = 3;
        int l = arr.length;
        rotateArr(arr, d, l);
        //rotateArrSwap(arr,d,l);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

    }

}
