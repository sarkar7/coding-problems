package sarkar.java.string;

import java.util.ArrayList;
import java.util.List;

public class MultiplyTwoStrings {

    public static void main(String[] args) {

        String str1 = "1234";
        String str2 = "";

        System.out.println(multiplyTwoStrings(str1, str2));
        System.out.println(multiplyTwoStrings(str2, str1));

    }

    private static String multiplyTwoStrings(String str1, String str2) {
        if (str1 == null || str1.equals("") || str2 == null || str2.equals(""))
            return null;

        int str2len = str2.length() - 1;
        List<String> muls = new ArrayList<>();

        for (int i = str2len; i >= 0; i--) {
            String mul = multiply(str1, String.valueOf(str2.charAt(i)));
            StringBuilder builder = new StringBuilder();
            builder.append(mul);
            int j = i;
            while (str2len - j > 0) {
                builder.append("0");
                j++;
            }
            muls.add(builder.toString());
            builder.delete(0, builder.length());
        }

        String num1 = muls.get(0);
        for (int k = 1; k < muls.size(); k++) {
            num1 = add(num1, muls.get(k));
        }
        return num1;
    }

    private static String multiply(String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        int len = s1.length() - 1;
        int num1 = Integer.parseInt(s2);
        int carry = 0;
        while (len >= 0) {
            int num2 = Integer.parseInt(String.valueOf(s1.charAt(len)));
            int res = carry + (num1 * num2);
            builder.append(res%10);
            carry = res/10;
            len--;
        }
        if (carry > 0) {
            builder.append(carry);
        }
        return builder.reverse().toString();
    }

    private static String add(String s1, String s2) {
        int len1 = s1.length() - 1;
        int len2 = s2.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        while (len1 >= 0 || len2 >= 0) {
            int digit1 = 0 ,digit2 = 0, sum = 0;
            if (len1 >= 0)
                digit1 = Integer.parseInt(String.valueOf(s1.charAt(len1--)));
            if (len2 >= 0)
                digit2 = Integer.parseInt(String.valueOf(s2.charAt(len2--)));

            sum = carry + digit1 + digit2;

            if (sum > 9) {
                builder.append(sum % 10);
                carry = sum / 10;
            } else {
                builder.append(sum);
                carry = 0;
            }
        }

        if (carry > 0)
            builder.append(carry);

        return builder.reverse().toString();
    }
}
