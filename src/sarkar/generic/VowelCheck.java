package sarkar.generic;

public class VowelCheck {

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
    }
}
