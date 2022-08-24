package sarkar.algo.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
            	map.put(nums[i], map.get(nums[i])+1);
            } else {
            	map.put(nums[i], 1);
            }
        }
        Iterator<Entry<Integer,Integer>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
        	Entry<Integer,Integer> entr = itr.next();
        	if (entr.getValue() == 1) {
        		return entr.getKey().intValue();
        	}
        }
        
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
