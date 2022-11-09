package sarkar.algo.math;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
		System.out.println(reverse(123));
		System.out.println(reverse(0));
		System.out.println(reverse(-521));
	}

	public static int reverse(int x) {
		int temp = 0;
		while (x != 0) {
			if (temp > Integer.MAX_VALUE / 10 || temp < Integer.MIN_VALUE / 10)
				return 0;

			int lastDigit = x % 10;
			temp = (temp * 10) + lastDigit;
			x /= 10;
		}
		return temp;
	}

}
