package sarkar.gfg.array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        if (n == 1) return arr;
        Stack<Integer> stack = new Stack<>();
        long[] res = new long[n];
        stack.push(0);
        int i = 1;
        while (i < n) {
            if (arr[i] <= arr[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                res[stack.pop()] = arr[i];
                if (stack.size() == 0) {
                    stack.push(i);
                    i++;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (res[j] == 0) {
                res[j] = -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //long[] arr = {6, 8, 0, 1, 3};
        long[] arr = {1, 3, 2, 4};
        Arrays.stream(nextLargerElement(arr, arr.length)).forEach(System.out::print);
    }

}
