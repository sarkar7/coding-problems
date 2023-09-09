package sarkar.java.string;

public class NthFibonacciNumber {

    public static void main(String[] args) {

        String first = "0";
        String second = "1";
        String sum = "";
        long n = 9;

        System.out.println(Long.MAX_VALUE); //9223372036854775807
        System.out.println(Long.MIN_VALUE); // -9223372036854775808

        for (long i = 2; i <= n; i++) {
            sum = add(first, second);
            first = second;
            second = sum;
        }

        System.out.println(second);


    }

    public static String add(String s1, String s2) {
        int len1 = s1.length() - 1;
        int len2 = s2.length() - 1;
        int carry = 0;
        StringBuilder builder = new StringBuilder();

        while (len1 >= 0 || len2 >= 0) {
            int digit1 = 0, digit2 = 0, sum = 0;
            if (len1 >= 0)
                digit1 = Integer.parseInt(String.valueOf(s1.charAt(len1--)));
            if (len2 >= 0)
                digit2 = Integer.parseInt(String.valueOf(s2.charAt(len2--)));

            sum = carry + digit1 + digit2;

            builder.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0)
            builder.append(carry);

        return builder.reverse().toString();
    }

}
