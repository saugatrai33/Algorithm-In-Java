package com.company.linkedlist;

import java.util.Optional;
import java.util.function.Consumer;

public class LinkedList {
    Consumer<Optional<Node>> printLinkedList =
            node -> node.ifPresentOrElse(
                    tNode -> {
                        while (tNode != null) {
                            System.out.print(tNode.next == null ? tNode.element + "->null" : tNode.element + "->");
                            tNode = tNode.next;
                        }
                    },
                    () -> System.out.println("Empty node.")
            );
    private Node head;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(6);
        linkedList.push(7);
        linkedList.push(1);
        linkedList.append(4);
        linkedList.insertAfter(
                Optional.ofNullable(linkedList.head.next),
                8
        );
        linkedList.insertAfter(
                Optional.ofNullable(linkedList.head.next.next),
                "HELLO WORLD"
        );
        System.out.println("\nLikedList::...........");
        linkedList.printLinkedList.accept(Optional.ofNullable(linkedList.head));
    }

    private <E> void insertAfter(Optional<Node> previousNode, E newElement) {
        previousNode.ifPresentOrElse(
                prevNode -> {
                    var newNode = new Node<>(newElement);
                    newNode.next = prevNode.next;
                    prevNode.next = newNode;
                },
                () -> System.out.println("Previous node not available.")
        );
    }

    <E> void push(E newElement) {
        var newNode = new Node<>(newElement);
        newNode.next = this.head;
        this.head = newNode;
    }

    <E> void append(E newElement) {
        var newNode = new Node<>(newElement);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        var lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    class Node<E> {
        E element;
        Node next;

        Node(E e) {
            this.element = e;
            this.next = null;
        }
    }
}
