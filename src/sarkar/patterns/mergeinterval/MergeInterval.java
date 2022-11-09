package sarkar.patterns.mergeinterval;

import java.util.*;

public class MergeInterval {

	public static int[][] merge(int[][] intervals) {
		if (intervals.length <= 1)
			return intervals;

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

	public static List<Interval> mergeIntervals(List<Interval> l) {
		if (l.size() == 0)
			return l;

		List<Interval> list = new ArrayList<>();

		Interval prev_interval = l.get(0);
		list.add(prev_interval);

		for (int i = 1; i < l.size(); i++) {
			Interval curr_interval = l.get(i);
			if (curr_interval.getStart() <= prev_interval.getEnd()) {
				if (curr_interval.getEnd() >= prev_interval.getEnd()) {
					prev_interval.setEnd(curr_interval.getEnd());
				}
			} else {
				prev_interval = curr_interval;
				list.add(prev_interval);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		List<Interval> l1 = Arrays.asList(new Interval(1, 5), new Interval(3, 7), new Interval(4, 6));
		List<Interval> l2 = Arrays.asList(new Interval(1, 5), new Interval(4, 6), new Interval(6, 8),
				new Interval(11, 15));
		List<Interval> l3 = Arrays.asList(new Interval(3, 7), new Interval(6, 8), new Interval(10, 12),
				new Interval(11, 15));
		List<Interval> l4 = Collections.singletonList(new Interval(1, 5));
		List<Interval> l5 = Arrays.asList(new Interval(1, 9), new Interval(4, 4), new Interval(3, 8));
		List<Interval> l6 = Arrays.asList(new Interval(1, 2), new Interval(3, 4), new Interval(8, 8));
		List<Interval> l7 = Arrays.asList(new Interval(1, 5), new Interval(1, 3));
		List<Interval> l8 = Arrays.asList(new Interval(1, 5), new Interval(6, 9));
		List<Interval> l9 = Arrays.asList(new Interval(0, 0), new Interval(1, 18), new Interval(1, 3));
		List<List<Interval>> lList = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9);

		for (List<Interval> intervals : lList) {
			// System.out.println(mergeIntervals(intervals));
		}

	}

}
