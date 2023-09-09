package sarkar.java.oop;

public class ClassTest {

    /*
    class innerTest{
        static void print() {
            System.out.println("Hi");
        }
    }

     */

    public static void main(String[] args) {
        StaticTest obj1 = new StaticTest(31, "Sourabh");
        //StaticTest obj2 = new StaticTest(41, "Sarkar");

        System.out.println(StaticTest.name);
    }

}
