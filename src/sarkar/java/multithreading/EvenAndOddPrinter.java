package sarkar.java.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenAndOddPrinter {

    private static final Object object = new Object();

    private static final IntPredicate evenPredicate = e -> e % 2 == 0;
    private static final IntPredicate oddPredicate = e -> e % 2 != 0;


    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> EvenAndOddPrinter.printResult(oddPredicate));
        CompletableFuture.runAsync(() -> EvenAndOddPrinter.printResult(evenPredicate));
        Thread.sleep(1000);
    }

    public static void printResult(IntPredicate condition) {
        IntStream.rangeClosed(1, 10)
                .filter(condition)
                .forEach(EvenAndOddPrinter::execute);
    }

    public static void execute(int i) {
        synchronized (object) {
            try {
                System.out.println("Thread Name: " + Thread.currentThread().getName() + " - " + "Count: " + i);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
