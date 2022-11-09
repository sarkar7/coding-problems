package sarkar.algo.hashing;

//  https://leetcode.com/problems/longest-consecutive-sequence/


import java.util.HashSet;
import java.util.Set;

public class LongestConsequtiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);
            
        int counter = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentCounter = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentCounter++;
                }
                counter = Math.max(counter, currentCounter);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
       // int[] arr = {100,4,200,1,3,2};
         int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(arr));
    }
}
