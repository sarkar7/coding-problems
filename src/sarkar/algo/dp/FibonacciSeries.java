package sarkar.algo.dp;

public class FibonacciSeries {

	private static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		//System.out.println(fib(100));
		findNthFib(100);
	}

	// 0 1 1 2 3 5

	static void findNthFib(int n) {
		if (n <= 1)
			System.out.println(n);
		long first = 0;
		long second = 1;
		long sum;
		for (int i = 2; i <= n; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		System.out.print(second);
	}
}
