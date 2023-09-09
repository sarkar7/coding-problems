package sarkar.patterns.xor;

public class XorTest {

    public static void main(String[] args) {

        int x1 = 1 ^ 2 ^ 3 ^ 4;
        int x2 = 1 ^ 2 ^ 3 ^ 5;

        System.out.println(x1 ^ x2);

    }

}
