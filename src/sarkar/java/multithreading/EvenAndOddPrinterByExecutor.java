package sarkar.java.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByExecutor {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.rangeClosed(1, 10)
                .forEach(num -> {
                    CompletableFuture<Integer> oddCompletableFutur = CompletableFuture.completedFuture(num)
                            .thenApplyAsync(x -> {
                                if (x % 2 != 0) {
                                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " - " + "Count: " + x);
                                }
                                return num;
                            }, executorService);
                    oddCompletableFutur.join();

                    CompletableFuture<Integer> evenCompletableFutur = CompletableFuture.completedFuture(num)
                            .thenApplyAsync(x -> {
                                if (x % 2 == 0) {
                                    System.out.println("Thread Name: " + Thread.currentThread().getName() + " - " + "Count: " + x);
                                }
                                return num;
                            }, executorService);
                    evenCompletableFutur.join();

                });
        executorService.shutdown();
    }

}
