package sarkar.java;

public class ModuloTest {

    public static void main(String[] args) {

        ModuloTest obj = new ModuloTest();

        System.out.println(obj.modulo(15));
        System.out.println(15/10);

        System.out.println(1+1);
    }

    int modulo(int num) {
        return num % 10;
    }

}