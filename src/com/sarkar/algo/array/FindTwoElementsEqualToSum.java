package com.sarkar.algo.array;

import java.util.HashMap;
import java.util.Map;

public class FindTwoElementsEqualToSum {

    public static void main(String[] args) {

        int[] arr = {3, 4, 8, 9, 11};
        int sum = 12;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum - arr[0], arr[0]);

        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            if (map.containsKey(temp)) {
                if (temp < map.get(temp)) {
                    System.out.println(temp + ", " + map.get(temp));
                }
                System.out.println(map.get(temp) + ", " + temp);
            }
            map.put(sum - arr[i], arr[i]);
        }

    }

}
