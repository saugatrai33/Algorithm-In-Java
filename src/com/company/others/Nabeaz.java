package com.company.others;

import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nabeaz {
    private static BiFunction<Integer, Integer, Integer> nabeazSum =
            (start, end) -> IntStream.rangeClosed(start, end)
                    .boxed()
                    .filter(x -> x % 3 == 0 && String.valueOf(x).contains("3"))
                    .peek(System.out::println)
                    .collect(Collectors.toList())
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();

    public static void main(String[] args) {
        long sum = nabeazSum.apply(1, 64);
        System.out.println(sum);
    }
}
