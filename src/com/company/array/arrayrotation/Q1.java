package com.company.array.arrayrotation;

import java.util.Arrays;
import java.util.function.Consumer;

public class Q1 {
    // Array rotation
    // Juggling Algorithm

    private Consumer<int[]> printArray =
            arr -> Arrays.stream(arr)
                    .forEach(System.out::println);

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        q1.leftRotate(arr, 2, 7);
        q1.printArray.accept(arr);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
     * <p>
     * a) Elements are first moved in first set
     * <p>
     * arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}
     * <p>
     * b)    Then in second set.
     * arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}
     * <p>
     * c)    Finally in third set.
     * arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}
     */
    private void leftRotate(int[] arr, int d, int n) {
        d = d % n;
        int i, j, k, temp;
        int gcd = gcd(d, n);
        for (i = 0; i < gcd; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
}
