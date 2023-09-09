package sarkar.java.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossibleSubStrings {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        String str = "abcdef";
        //System.out.println(generateSubStrings(str));
        generateSubStringRecursively(str, 0, 1);
        System.out.println(list.size());
        System.out.println(list);

    }

    static List<String> generateSubStrings(String str) {
        StringBuilder builder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                builder.append(str.charAt(j));
                list.add(builder.toString());
            }
            builder.delete(0, builder.length());
        }
        return list;
    }


    static void generateSubStringRecursively(String str, int begin, int end) {
        if (str.length() == 1) {
            list.add(str);
            return;
        }
        if (begin == end) return;
        if (end > str.length()) {
            begin++;
            end = begin + 1;
        }
        if (begin == str.length()) return;

        list.add(str.substring(begin, end));
        generateSubStringRecursively(str, begin, end + 1);
    }






}
