package sarkar.algo.slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> window = new ArrayDeque<> ();

        if (nums.length == 0)
            return nums;
        if (k > nums.length)
            k = nums.length;

        for (int i = 0; i < k; i++) {
            while((!window.isEmpty()) && nums[i] >= nums[window.peekLast()]) {
                window.removeLast();
            }
            window.addLast(i);
        }

        result.add(nums[window.peek()]);
        for (int i = k; i<nums.length; i++) {
            while ((!window.isEmpty()) && nums[i] >= nums[window.peekLast()]) {
                window.removeLast();
            }
            if ((!window.isEmpty()) && window.peek()<= (i - k))
                window.removeFirst();
            window.addLast(i);
            result.add(nums[window.peek()]);
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;

    }

    public static ArrayDeque<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        Deque<Integer> window = new ArrayDeque<> ();

        if (nums.size() == 0)
            return result;

        if (windowSize > nums.size())
            windowSize = nums.size();

        // Find out the maximum in the first window
        for (int i = 0; i<windowSize; i++) {
            while ((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
                window.removeLast();
            }
            window.addLast(i);
        }

        // Appending the largest element in the window to the result
        result.add(nums.get(window.peek()));
        for (int i = windowSize; i<nums.size(); i++) {
            while ((!window.isEmpty()) && nums.get(i) >= nums.get(window.peekLast())) {
                window.removeLast();
            }
            if ((!window.isEmpty()) && window.peek()<= (i - windowSize))
                window.removeFirst();
            window.addLast(i);
            result.add(nums.get(window.peek()));
        }
        return result;
    }

    public static void main(String args[]) {
        List<Integer> targetList = Arrays.asList(18, 2, 1, 2, 4, 3, 2);
        List<List<Integer>> numLists = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                Arrays.asList(10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67),
                Arrays.asList(4, 5, 6, 1, 2, 3),
                Arrays.asList(9, 5, 3, 1, 6, 3),
                Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16),
                Arrays.asList(-1, -1, -2, -4, -6, -7),
                Arrays.asList(4, 4, 4, 4, 4, 4)
        );
        for (int i = 0; i<numLists.size(); i++) {
            System.out.println(i + 1 + ". Original array:\t" + numLists.get(i));
            System.out.println("Input window size:\t\t\t " + targetList.get(i));
            System.out.println("Window size used for the problem:\t" + findMaxSlidingWindow(numLists.get(i), targetList.get(i)));
            //System.out.println(PrintHyphens.repeat("-", 100));
        }
    }

}
