package sarkar.algo.string;

public class StringToNumber {

	public static int myAtoi(String s) {
		if (s == null || s.length() < 1) return 0;

		final int INT_MAX = Integer.MAX_VALUE;
		final int INT_MIN = Integer.MIN_VALUE;

		String str = s.replaceAll("^\\s+", "");

		int i = 0;
		boolean isNegative = str.startsWith("-");
		boolean isPositive = str.startsWith("+");
		if (isNegative)
			i++;
		else if (isPositive)
			i++;

		double number = 0;
		while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			number = number * 10 + (str.charAt(i) - '0');
			i++;
		}

		number = isNegative ? -number : number;
		
		if (number < INT_MIN) return INT_MIN;
		if (number > INT_MAX) return INT_MAX;
		return (int) number;
	}

	public static void main(String[] args) {

	}

}
