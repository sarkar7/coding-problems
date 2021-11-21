package com.sarkar.algo.array;

public class BuySellStocks {

	public static void main(String[] args) {
		int[] arr = {7,6,4,3,1};
		System.out.println(maxProfit(arr));

	}

	
	public static int maxProfit(int[] prices) {
        int min = prices[0];
        int minIndex = 0;
        //Identifying min
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        
        if (minIndex == prices.length - 1) return 0;
        int max = prices[minIndex + 1];
        if (minIndex + 1 < prices.length - 1) {
            // Because there is no possibility of considering any value before minIndex
            for (int j = minIndex + 1; j < prices.length; j++) {
                if (prices[j] > max) {
                    max = prices[j];
                }
            }
        }
        
        return max - min;
        
    }
	
}
