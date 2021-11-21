package com.sarkar.algo.recursion;

public class Fibonacci {

	public static void main(String[] args) {

		fib(5);
		System.out.println();
		System.out.println(sumOfFib(5));

	}

	private static void fib(int n) {
		fibHelper(0, 1, n);
	}

	private static void fibHelper(int i, int j, int n) {
		if (n == 1) {
			return;
		}
		if (i == 0)
			System.out.print(i + " ");
		System.out.print(j + " ");
		fibHelper(j, i + j, n - 1);

	}

	// This is not an optimized solution
	private static int sumOfFib(int n) {
		if (n <= 1) return n;
		return sumOfFib(n - 1) + sumOfFib(n - 2);
	}

}
