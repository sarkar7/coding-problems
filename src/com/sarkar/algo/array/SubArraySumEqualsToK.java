package com.sarkar.algo.array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsToK {

	public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prevSum = new HashMap<>();
        prevSum.put(0, 1);
        int res = 0;
        int sum_so_far = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum_so_far += nums[i];
            int removeSum = sum_so_far - k;
            if (prevSum.containsKey(removeSum)){
                res += prevSum.get(removeSum);
            }
            prevSum.put(sum_so_far, prevSum.getOrDefault(sum_so_far, 0) + 1);
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		System.out.println(subarraySum(arr, 3));

	}

}
