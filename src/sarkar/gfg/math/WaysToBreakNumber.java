package sarkar.gfg.math;

import java.math.BigInteger;

public class WaysToBreakNumber {

    static int waysToBreakNumber(int N ){
        long a = N;
        return (int) ((((a + 1) * (a + 2)) / 2) % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(waysToBreakNumber(1000055));//1000055
    }

}
