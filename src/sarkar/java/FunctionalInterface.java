package sarkar.java;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        Function<String, String> function = String::toLowerCase;
        System.out.println(function.apply("SouRAbH"));

        BiFunction<Integer, Integer, Integer> biFunction  = (a, b) -> a + b;
        System.out.println(biFunction.apply(2,3));

        Predicate<String> predicate = String::isEmpty;
        System.out.println(predicate.test("Sarkar"));

        BiPredicate<Integer, Integer> biPredicate = Integer::equals;
        System.out.println(biPredicate.test(2, 2));

        Consumer<String> consumer = System.out::println;
        consumer.accept("Technology");

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        BiConsumer<String, String> biConsumer = (s, t) -> System.out.println(s.concat(t));
        biConsumer.accept("Sourabh", " Sarkar");


    }

}
