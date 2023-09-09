package sarkar.java.string;

import java.util.HashMap;
import java.util.Map;

public class WordCount {


    public static Map<String, Integer> getCount(String str) {
        Map<String, Integer> map = new HashMap<>();
        int f_p = 0, s_p = 1;
        int length = str.length();

        while (s_p <= length - 1) {
            if (str.charAt(f_p) + 1 == str.charAt(s_p)) { // Contiguous check
                String temp = str.substring(f_p, s_p + 1);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
                f_p = s_p + 1;
                s_p += 2;
            } else {
                String temp = str.substring(f_p, s_p);
                map.put(temp, map.getOrDefault(temp, 0) + 1);
                f_p++;
                s_p++;
            }
        }

        while (f_p < length) { // Considering remaining alphabets in case of odd length
            String temp = str.substring(f_p, length);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
            f_p++;
        }

        return map;
    }

    public static void main(String[] args) {
        String str = "ABABCDABEFCDEF";      // {AB=3, CD=2, EF=2}
      // String str = "ABCEFGIHEFPQEFL";    // {AB=1, EF=3, PQ=1, C=1, G=1, H=1, I=1, L=1}
      //  String str = "ABCABC";
        System.out.println(getCount(str));
    }

}
