package com.sarkar.algo.recursion;

public class SimpleRecursiveSolutions {

	public static void main(String[] args) {
		printOneToN(5);
		System.out.println();
		printNToOne(5);
		System.out.println();
		System.out.println(factorial(5));
		System.out.println(multiplyAllTheDigits(56232));
		System.out.println(AddAllTheDigits(56232));
		reverseANumber(56232);
		System.out.println("Number of zeros - " + countNumberOfZeros(50012050));
	}

	private static int countNumberOfZeros(int i) {
		return helperCountNumberOfZeros(i, 0);
	}

	private static int helperCountNumberOfZeros(int i, int count) {
		if (i % 10 == i)
			return count;
		if (i % 10 == 0) {
			return helperCountNumberOfZeros(i / 10, count + 1);
		} else {
			return helperCountNumberOfZeros(i / 10, count);
		}
	}

	private static int reverseANumber(int i) {
		return i;
	}

	private static int AddAllTheDigits(int i) {
		if (i == 0)
			return 0;
		return i % 10 + AddAllTheDigits(i / 10);
	}

	private static long multiplyAllTheDigits(int i) {
		if (i % 10 == i)
			return i;
		return i % 10 * multiplyAllTheDigits(i / 10);
	}

	private static int factorial(int i) {
		if (i == 1)
			return 1;
		return i * factorial(i - 1);
	}

	private static void printNToOne(int i) {
		if (i == 0)
			return;
		System.out.print(i + " ");
		printOneToN(i - 1);
	}

	private static void printOneToN(int i) {
		if (i == 0)
			return;
		printOneToN(i - 1);
		System.out.print(i + " ");
	}

}
