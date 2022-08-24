package sarkar.algo.string;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ALGORITHM";
        reverseByTwoPointers(str);
        System.out.println();
        reverseByUsingStack(str);

    }

    private static void reverseByUsingStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        while (stack.size() != 0) {
            System.out.print(stack.pop());
        }
    }

    private static void reverseByTwoPointers(String str) {
        int length = str.length();
        char[] chArr = str.toCharArray();
        for (int f = 0, l = length - 1; f <= (length - 1) / 2 - 1 && l >= (length - 1) / 2 + 1 ; f++, l-- ) {
            swap(chArr, f, l);
        }
        for (char c : chArr) {
            System.out.print(c);
        }
    }

    private static void swap(char[] chArr, int f, int l) {
        char temp = chArr[f];
        chArr[f] = chArr[l];
        chArr[l] = temp;
    }

}
