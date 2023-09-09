package sarkar.patterns.xor;

public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 3, 2, 3};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] arr) {
        int x1 = 0;
        for (int j : arr) {
            x1 = x1 ^ j;
        }
        return x1;
    }

}
