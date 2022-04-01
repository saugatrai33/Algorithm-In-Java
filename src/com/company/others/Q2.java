package com.company.others;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Q2 {
    private static BiFunction<Integer, Integer, Integer> quarticGaussSum =
            (start, end) -> IntStream.rangeClosed(start, end)
                    .boxed()
                    .mapToInt(num -> (int) Math.pow(num, 4))
                    .sum();

    public static void main(String[] args) {
        var sum = quarticGaussSum.apply(1, 64);
        System.out.println(sum);
    }
}
