package sarkar.patterns.warmup;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));

    }

}
