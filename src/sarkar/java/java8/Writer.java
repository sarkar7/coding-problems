package sarkar.java.java8;

public interface Writer {

    default void write() {
        System.out.println("Writer is writing...");
    }

}
