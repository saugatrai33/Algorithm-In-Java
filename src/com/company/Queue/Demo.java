package com.company.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<String> shoppings = new LinkedList<>();
        shoppings.add("iPhone");
        shoppings.add("Mac");
        shoppings.add("Tesla");
        System.out.println(shoppings.peek());
        System.out.println(shoppings.element());
        System.out.println(shoppings.poll());
        System.out.println(shoppings.peek());

        Iterator<String> iterator = shoppings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
