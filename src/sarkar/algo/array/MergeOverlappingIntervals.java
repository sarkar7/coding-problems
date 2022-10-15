package sarkar.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {

    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,6}, {8,10}, {15,18}};

        for (int[] i : mergeIntervals(arr)) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));

        List<int[]> output_arr = new ArrayList<>();
        int[] current_interval = intervals[0];
        output_arr.add(current_interval);

        for (int[] interval : intervals) {
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if (current_end >= next_begin) {
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output_arr.add(current_interval);
            }
        }
        return output_arr.toArray(new int[output_arr.size()][]);
    }


}
