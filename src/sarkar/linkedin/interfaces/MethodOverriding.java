package sarkar.linkedin.interfaces;

public class MethodOverriding implements One, Two {

    @Override
    public void method() {
        Two.super.method();
    }
}


interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method () {
        System.out.println("One");
    }
}