package sarkar.algo.math;

public class PowXn {

    public static double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;

        // Making the power positive in case of negative power
        if (nn < 0) {
            nn = -1 * nn;
        }

        while (nn > 0) {
            if (nn % 2 == 1) {
                ans = ans * x;
                nn = nn - 1;
            } else {
                x = x * x;
                nn = nn / 2;
            }
        }
        // In case of negative power, ans = 1 / ans
        if (n<0) {
            ans = 1.0 / ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,-2));
    }

}
