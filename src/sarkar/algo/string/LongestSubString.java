package sarkar.algo.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public static void main(String[] args) {
		
		String str = "abcabcbb";
		System.out.println(findSubString(str));
	}

	private static int findSubString(String str) {
		Set<Character> set = new HashSet<>();
		if (str.length() == 0) return 0;
		if (str.length() == 1) return 1;
		int i = 0, j = 1;
		StringBuilder sb = new StringBuilder();
		set.add(str.charAt(0));
		sb.append(str.charAt(0));
		while (i < str.length() - 1 && j <= str.length() - 1) {
			
			if (i == j) {
				sb = new StringBuilder();
				sb.append(str.charAt(i));
				j++;
			}
			
			if (str.charAt(i) != str.charAt(j) && !set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				sb.append(str.charAt(j));
				j++;
			} else {
				i++;
			}
			
			
		}
		return sb.length();
		
	}

}
