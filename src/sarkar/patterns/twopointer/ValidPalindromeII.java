package sarkar.patterns.twopointer;

public class ValidPalindromeII {

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		int counter = 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				if (counter < 1)
					return false;
				right = right - 1;
				counter--;
			} else {
				left = left + 1;
				right = right - 1;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "tebbem";
		
		System.out.println(isPalindrome(s));

	}

}
