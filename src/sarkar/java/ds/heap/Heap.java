package sarkar.java.ds.heap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Heap {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 5, 9, 6};

        PriorityQueue<Integer> qa = new PriorityQueue<>();
        qa.addAll(IntStream.of(arr).boxed().collect(Collectors.toList()));
        System.out.println(qa.peek());

        PriorityQueue<Integer> qb = new PriorityQueue<>(Comparator.reverseOrder());
        qb.addAll(IntStream.of(arr).boxed().collect(Collectors.toList()));
        System.out.println(qb.peek());

    }

}
