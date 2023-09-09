package sarkar.generic;

public class SwapTwoWithoutThird {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        b = a + b;
        a = b - a;
        b = b - a;

        System.out.println("a - " + a + " & b - " + b);

    }
}
