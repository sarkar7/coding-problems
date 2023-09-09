package sarkar.java.string;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madbm";
        System.out.println(checkPalindromeRecursively(str, 0, str.length() - 1));
    }

    static boolean checkPalindromeRecursively(String str, int begin, int end) {
        if (begin == end)
            return true;
        if (str.charAt(begin) == str.charAt(end)) {
            return checkPalindromeRecursively(str, begin + 1, end - 1);
        }
        return false;
    }

}
