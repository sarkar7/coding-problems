package sarkar.algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {

		// doPermutationRecursively("", "abc");
		// List<String> list = permutationList("", "abc");
		// System.out.println(list);

		System.out.println(permutationCount("", "abc"));

	}

	static void doPermutationRecursively(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);

		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			doPermutationRecursively(f + ch + s, up.substring(1));
		}
	}

	static List<String> permutationList(String p, String up) {

		if (up.isEmpty()) {
			List<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		char ch = up.charAt(0);
		List<String> ans = new ArrayList<>();

		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			ans.addAll(permutationList(f + ch + s, up.substring(1)));
		}

		return ans;
	}

	static int permutationCount(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return 1;
		}

		char ch = up.charAt(0);
		int count = 0;
		for (int i = 0; i <= p.length(); i++) {
			String f = p.substring(0, i);
			String s = p.substring(i, p.length());
			count += permutationCount(f + ch + s, up.substring(1));
		}

		return count;
	}
}
