package sarkar.algo.array;

import java.util.Arrays;

public class ProductExceptSelf {
	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        
        int[] prefixArr = new int[n];
        int[] postfixArr = new int[n];
        int[] res = new int[n];
        prefixArr[0] = 1;
        postfixArr[n-1] = 1;
        
        for (int i = 1; i < n; i++) {
            prefixArr[i] = nums[i - 1] * prefixArr[i - 1];
        }
        
        for (int i = n - 2; i >= 0; i--) {
        	postfixArr[i] = nums[i + 1] * postfixArr[i + 1];
        }
        
        for (int i = 0; i < n; i++) {
        	res[i] = prefixArr[i] * postfixArr[i];
        }
        System.out.println(Arrays.toString(prefixArr));
        System.out.println(Arrays.toString(postfixArr));
        return res;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(arr)));

	}

}
