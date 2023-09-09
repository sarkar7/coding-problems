package sarkar.generic;

public class RemoveSpacesFromString {

    public static void main(String[] args) {
        String str = " so ur a bh ";
        String[] strArr = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s : strArr) {
            builder.append(s);
        }
        System.out.println(builder);
    }
}
