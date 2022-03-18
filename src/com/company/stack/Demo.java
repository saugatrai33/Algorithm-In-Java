package com.company.stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<String> task = new Stack<>();
        task.push("code");
        task.push("java code");
        task.push("android code");
        task.add("angular cod");

        System.out.println(task.peek());
        System.out.println(task.pop());

        var iterator = task.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
