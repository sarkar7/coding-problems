package sarkar.algo.dp;

public class LongestCommonSubSequence {


    public static void findLcs(String a, String b) {
        System.out.println(findLcsHelper(a,0,b,0,""));
    }

    public static int findLcsHelper(String a, int i, String b, int j, String p) {
        if (a.length() == i || b.length() ==j) {
            return 0;
        }

        if (a.charAt(i) == b.charAt(j)) {
            p =  p+a.charAt(i);
            return 1 + findLcsHelper(a, i+1, b, j, p);
        }

        int m = Math.max(findLcsHelper(a, i+1, b, j, p), findLcsHelper(a, i, b, j+1, p));
        return m;
    }

    public static void main(String[] args) {
        findLcs("abcde", "abfce");
    }

}
