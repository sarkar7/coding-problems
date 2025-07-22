package sarkar.java.conditional;

public class SwitchTest {

    public static void main(String[] args) {
        User user = new User(45);
        test(user);
    }

    private static void test(User user) {
        switch (user.age) {
            case 30, 40 -> System.out.println("2");
            case 50 -> System.out.println("3");
            default -> System.out.println("default");
        }
    }


}

class User {
    int age;
    User(int a) {
        this.age = a;
    }
}
