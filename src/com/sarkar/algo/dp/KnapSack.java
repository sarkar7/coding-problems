package com.sarkar.algo.dp;

public class KnapSack {

	public static void main(String[] args) {
		int[] w = {2, 3, 1, 4};
		int[] p = {4, 5, 3, 7};
		int capacity = 5;
		System.out.println(findMaxProfit(w, p, capacity, 0, w.length - 1));

	}
	
	private static int findMaxProfit(int[] w, int[] p, int capacity, int sum, int l) {
		//base condition
		if (capacity <= 0) {
			return sum;
		}
		
		return Math.max(findMaxProfit(w, p, capacity - w[l], sum + p[l], l - 1), 
				findMaxProfit(w, p, capacity, sum, l - 1));
	}

}
