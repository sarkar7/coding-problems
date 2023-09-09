package sarkar.algo.dp;

public class LongestPalindromicSubstring {

    public static void longestPalindrome(String s) {
        if (s.isEmpty())
            return;

        if (s.length() == 1) {
            System.out.println("Maximum length is 1");
            return;
        }

        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                System.out.println("Maximum length is 2");
            } else {
                System.out.println("Maximum length is 1");
            }
            return;
        }

        // logic for the string with length greater than 2
        int[][] dp = new int[s.length()][s.length()];
        int i = 0, j = 0;
        while (i < s.length()) {
            dp[i][j] = 1;
            i++;
            j++;
        }

        int count = 1;
        int maxLength = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        while (count < s.length()) {
            i = 0;
            j = count;
            while (i < s.length() - count) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        startIndex = i;
                        endIndex = j;
                    }
                } else {
                    dp[i][j] = 0;
                }
                i++;
                j++;
            }
            count++;
        }

        System.out.println("Maximum length is " + maxLength + " & start index - " + startIndex + " | end index - " + endIndex);
    }


    public static void main(String[] args) {
        longestPalindrome("MA");
    }

}
