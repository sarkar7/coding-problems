package com.sarkar.java.bitwise;

public class FindUniqueFromAnArray {

    public static void main(String[] args) {

        int[] nums = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        System.out.println(findUnique(nums));

    }

    private static int findUnique(int[] nums) {
        int unique = 0;

        for (int n : nums) {
            unique ^= n;
        }

        return unique;
    }

}
