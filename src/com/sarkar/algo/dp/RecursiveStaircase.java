package com.sarkar.algo.dp;

public class RecursiveStaircase {


    public static int findWaysToClimb(int n) {
        /*
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;
        return findWaysToClimb(n-1) + findWaysToClimb(n-2);
        */

        int[] stair = new int[n+1];
        stair[0] = 1;
        stair[1] = 1;
        for (int i = 2; i <= n; i++) {
            stair[i] = stair[i-1] + stair[i-2];
        }
        return stair[n];

    }

    public static void main(String[] args) {
        System.out.println(findWaysToClimb(4));
    }

}
