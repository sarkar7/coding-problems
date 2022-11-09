package sarkar.patterns.twopointer;

public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			
			left = left + 1;
			right = right - 1;
		}
		return true;
	}

	public static void main(String[] args) {
		String[] testCase = { "RACEACAR", "A", "ABCDEFGFEDCBA", "ABC", "ABCBA", "ABBA", "RACEACAR" };
		for (int k = 0; k < testCase.length; k++) {
			System.out.println(testCase[k] + " - " + isPalindrome(testCase[k]));
		}
	}

}
