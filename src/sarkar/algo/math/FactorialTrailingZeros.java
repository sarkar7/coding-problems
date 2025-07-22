package sarkar.algo.math;

public class FactorialTrailingZeros {

    public static void main(String[] args) {
        int n = 11;
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        System.out.println("Number of trailing zero - " + count);
    }
}
