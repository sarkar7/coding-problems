package sarkar.algo.recursion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(515));
    }

    private static boolean isPalindrome(int i) {
        return i == reverseANumber(i);
    }

    private static int reverseANumber(int i) {
        return i;
    }

}
