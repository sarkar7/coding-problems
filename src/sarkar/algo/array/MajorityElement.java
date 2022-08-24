package sarkar.algo.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(majorityElement1(arr));
	}
	
	 public static int majorityElement1(int[] nums) {
	        int k = nums.length / 2;
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	        	if (map.containsKey(nums[i])) {
	        		map.put(nums[i], map.get(nums[i]) + 1);
	        	} else {
	        		map.put(nums[i], 1);
	        	}
	        }
	        
	        Iterator<Entry<Integer, Integer>> itr = map.entrySet().iterator();
	        while (itr.hasNext()) {
	        	Entry<Integer, Integer> entry = itr.next();
	        	if (entry.getValue() > k) {
	        		return entry.getKey();
	        	}
	        }
	        
	        return -1;
	 }

}
