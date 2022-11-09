package sarkar.algo.string;

// String to Integer - Atoi

public class Atoi {

    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        String str = s.trim();
        boolean isNegative = str.charAt(0) == '-';
        if(isNegative)
            str = str.substring(1);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                builder.append(ch);
            }
        }
        int a = Integer.parseInt(builder.toString());
        return isNegative ? -1 * a : a;
    }

    public static void main(String[] args) {
        String str = "words and 987";
        System.out.println(myAtoi(str));
    }

}
