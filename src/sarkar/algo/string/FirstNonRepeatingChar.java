package sarkar.algo.string;

public class FirstNonRepeatingChar {

    public static int firstUniqChar(String s) {
        char[] chArr = s.toCharArray();
        int[] freq = new int[26];
        for (char c : chArr) {
            int index = c - 97;
            freq[index] = freq[index] + 1;
        }

        for (int j = 0; j < chArr.length; j++) {
            if (freq[chArr[j] - 97] == 1) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }


}

