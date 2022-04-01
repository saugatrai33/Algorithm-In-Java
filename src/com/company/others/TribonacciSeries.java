package com.company.others;

public class TribonacciSeries {
    public static void main(String[] args) {
        System.out.println((tribonacciTerm(32)));
    }

    public static int tribonacciTerm(int n) {
        if (n < 3)
            return n;
        int a = 1, b = 0, c = 5, d;
        while (n-- > 3) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
}
