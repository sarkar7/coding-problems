package sarkar.algo.array;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int n = digits.length - 1;
		int l = n;
		int c = 0;
		while (n > -1) {
			if (l > n && c==0) {
				break;
			}
			
			if (digits[n] > 8) {
				digits[n] = 0;
				c = 1;
			} else {
				if (n == l) {
					digits[n] = digits[n] + 1;
				}
				if (c == 1) {
					digits[n] = digits[n] + c;
					c = 0;
				}
			}
			n--;
		}

		if (c == 1) {
			int[] res = new int[digits.length + 1];
			res[0] = c;
			for (int i = 1; i < res.length; i++) {
				res[i] = digits[i - 1];
			}
			return res;
		}

		return digits;
	}

	public static void main(String[] args) {
		//int[] arr = { 9,8,7,6,5,4,3,2,1,0 };
		//int[] arr = {1, 2, 3};
		//int[] arr = {9};
		int[] arr = {8, 9, 9, 9};
		for (int i : plusOne(arr)) {
			System.out.print(i);
		}
	}

}
