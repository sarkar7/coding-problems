package sarkar.java.string;

public class AddTwoNumbers {

    public static void main(String[] args) {
        String[] str = {"19", "21", "112"};
        add("4936", "37020");
    }

    public static void add(String s1, String s2) {
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

        System.out.println(builder.reverse());
    }
}
