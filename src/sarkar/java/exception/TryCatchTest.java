package sarkar.java.exception;

public class TryCatchTest {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        int i = 0;
        try {
            int j = 10/0;
            return i = 10;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            i = 15;
        }
        return i;
    }

}
