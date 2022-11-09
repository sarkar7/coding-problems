package sarkar.patterns.mergeinterval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection {

    public static List <Interval> intervalsIntersection(List<Interval> intervalLista, List <Interval> intervalListb) {
        List <Interval> intersections = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < intervalLista.size() && j < intervalListb.size()) {
            // Let's check if intervalLista[i] intervalListb[j]
            // 1. start - the potential startpoint of the intersection
            // 2. end - the potential endpoint of the intersection
            int start = Math.max(intervalLista.get(i).getStart(), intervalListb.get(j).getStart());
            int end = Math.min(intervalLista.get(i).getEnd(), intervalListb.get(j).getEnd());

            if (start <= end) { // if this is an actual intersection
                intersections.add(new Interval(start, end)); // add it to the list
            }

            // Move forward in the list whose interval ends earlier
            if (intervalLista.get(i).getEnd() < intervalListb.get(j).getEnd()) {
                i += 1;
            } else {
                j += 1;
            }
        }
        return intersections;
    }

    public static void main(String[] args) {
        List < List < Interval >> inputIntervalLista = Arrays.asList(Arrays.asList(new Interval(1, 2)), Arrays.asList(new Interval(1, 4), new Interval(5, 6), new Interval(9, 15)), Arrays.asList(new Interval(3, 6), new Interval(8, 16), new Interval(17, 25)), Arrays.asList(new Interval(4, 7), new Interval(9, 16), new Interval(17, 28), new Interval(39, 50), new Interval(55, 66), new Interval(70, 89)), Arrays.asList(new Interval(1, 3), new Interval(5, 6), new Interval(7, 8), new Interval(12, 15)));
        List < List < Interval >> inputIntervalListb = Arrays.asList(Arrays.asList(new Interval(1, 2)), Arrays.asList(new Interval(2, 4), new Interval(5, 7), new Interval(9, 15)), Arrays.asList(new Interval(2, 3), new Interval(10, 15), new Interval(18, 23)), Arrays.asList(new Interval(3, 6), new Interval(7, 8), new Interval(9, 10), new Interval(14, 19), new Interval(23, 33), new Interval(35, 40), new Interval(45, 59), new Interval(60, 64), new Interval(68, 76)), Arrays.asList(new Interval(2, 4), new Interval(7, 10)));

        for (int i = 0; i < inputIntervalLista.size(); i++) {
            System.out.println(
                    intervalsIntersection(inputIntervalLista.get(i), inputIntervalListb.get(i))
            );
        }
    }

}
