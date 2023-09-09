package sarkar.java.bitwise;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length;
        int x1 = 1;
        for (int i = 2; i <= n; i++) {
            x1 = x1 ^ i;
        }

        int x2 = arr[0];
        for (int i = 1; i < n-1; i++) {
            x2 = x2 ^ arr[i];
        }

        return x1 ^ x2;
    }
}
