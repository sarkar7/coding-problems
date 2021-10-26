package com.sarkar.algo.recursion;

public class SumAllTheElementsOfAnArray {
	
	static int doSum(int[] arr, int i) {
		if (arr.length - 1 == i) return arr[i];
		return arr[i] + doSum(arr, i+1);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(doSum(arr, 0));
	}

}
