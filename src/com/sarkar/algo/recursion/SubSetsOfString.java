package com.sarkar.algo.recursion;

public class SubSetsOfString {

	public static void main(String[] args) {
		String str = "abc";
		subSeq(str);
	}

	private static void subSeq(String str) {
		findSubSetsRecursively("", str);
	}

	private static void findSubSetsRecursively(String processed, String unprocessed) {

		if (unprocessed.isEmpty()) {
			System.out.println(processed);
			return;
		}

		char ch = unprocessed.charAt(0);
		findSubSetsRecursively(processed + ch, unprocessed.substring(1));
		findSubSetsRecursively(processed, unprocessed.substring(1));

	}

}
