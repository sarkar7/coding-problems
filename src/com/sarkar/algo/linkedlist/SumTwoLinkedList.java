package com.sarkar.algo.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class SumTwoLinkedList {

	public static void main(String[] args) {

		List<Integer> fl = new ArrayList<>();
		List<Integer> sl = new ArrayList<>();
		List<Integer> rl = new ArrayList<>();
		fl.add(1);
		fl.add(1);
		fl.add(2);
		fl.add(3);

		sl.add(1);
		sl.add(2);
		sl.add(3);

		int carry = 0;
		for (int i = fl.size() - 1, j = sl.size() - 1; i >= 0 || j >= 0; i--, j--) {
			int n = fl.get(i) + sl.get(j) + carry;
			if (n % 10 != n) {
				rl.add(n % 10);
				carry = n / 10;
			} else {
				rl.add(n);
				carry = 0;
			}
		}

		rl.forEach(System.out::println);

	}

}
