package com.sarkar.algo.array;

public class BuySellStocks {

	public static void main(String[] args) {
		// int[] arr = { 7, 6, 4, 3, 1 };
		int[] arr = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));
		System.out.println(maxProfit1(arr));
		System.out.println(maxProfit2(arr));

	}

	public static int maxProfit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max_profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else if (prices[i] - min > max_profit) {
				max_profit = prices[i] - min;
			}
		}
		
		return max_profit;
	}

	public static int maxProfit1(int[] prices) {
		int min = prices[0];
		int minIndex = 0;
		// Identifying min
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
				minIndex = i;
			}
		}

		if (minIndex == prices.length - 1)
			return 0;
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

	public static int maxProfit2(int[] prices) {
		int left = 0;
		int min = prices[left];
		int maxProfit = 0;

		for (int right = 1; right < prices.length; right++) {
			if (prices[left] < prices[right]) {
				if (prices[left] < min) {
					min = prices[left];
					maxProfit = 0;
				}

				if (prices[right] - min > maxProfit) {
					maxProfit = prices[right] - min;
				}
			}
			left++;
		}
		return maxProfit;

	}

}
