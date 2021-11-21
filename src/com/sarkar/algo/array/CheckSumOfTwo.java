package com.sarkar.algo.array;

import java.util.HashSet;
import java.util.Set;

public class CheckSumOfTwo {

    public static boolean isEqualToSumOfTwo(int[] input, int target) {
        Set<Integer> numberSet = new HashSet<>();
        for(int i : input) {
            if (numberSet.contains(target - i)) {
                return true;
            }
            numberSet.add(i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {12, 7, 9, 2, 11, 4, 5, 5};
        System.out.println(
                isEqualToSumOfTwo(arr, 10)
        );
    }

}
