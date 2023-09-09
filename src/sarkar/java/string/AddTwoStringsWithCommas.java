package sarkar.java.string;

public class AddTwoStringsWithCommas {

    public static void main(String[] args) {
        String str1 = "111,236,556,845";
        String str2 = "999,991,345,344";

        String res = add(str1.replace(",",""), str2.replace(",",""));
        System.out.println(res);
        System.out.println(formatResultWithCommas(res));
    }

    private static String formatResultWithCommas(String res) {
        StringBuilder builder = new StringBuilder();
        int resLen = res.length() - 1;
        int counter = 3;
        for (int i = resLen; i >= 0; i--) {
            builder.append(res.charAt(i));
            counter--;
            if (counter == 0 && i > 0) {
                builder.append(",");
                counter = 3;
            }
        }
        return builder.reverse().toString();
    }

    private static String add(String s1, String s2) {
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
