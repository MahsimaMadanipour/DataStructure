package com.company;

import java.util.Scanner;

/**
 * @author Mahsima Madanipour
 */

public class Node {
    private int element;
    private Node next;

    //construction
    public Node(int element, Node next) {
        this.element = element;
        this.next = next;
    }

    //setters and getters: lines 16 ~ 30
    private void setElement(int element) {
        this.element = element;
    }

    private void setNext(Node next) {
        this.next = next;
    }

    private Integer getElement() {
        return this.element;
    }

    private Node getNext() {
        return this.next;
    }

    //making a linked list with inputs
    public static Node setLinkedList(int length) {
        if (length == 0) {
            return null;
        }

        Scanner input = new Scanner(System.in);
        Node node = new Node(input.nextInt(), setLinkedList(--length));

        return node;
    }

    //Question 1: removing similar/duplicate elements
    public Integer removeSimilar(int length) {
        Node node = this;
        for (int i = 0; i < length; i++) {
            Node temp1 = node;
            Node temp2 = node.getNext();
            for (int j = i + 1; j < length; j++) {
                if (node.getElement() == temp2.getElement()) {
                    temp1.setNext(temp2.getNext());
                    length--;
                    j--;
                } else {
                    temp1 = temp2;
                }
                temp2 = temp2.getNext();
            }
            node = node.getNext();
        }
        return length;
    }

    //Question 2: reversing the linked list
    Node reverse(Node preNode, int length) {
        Node node = this;
        for (int i = 0; i < length; i++) {
            Node nextNode = node.getNext();
            node.setNext(preNode);
            preNode = node;
            node = nextNode;
        }
        return preNode;
    }

    //Question 2: reversing the linked list recursively
    Node recursiveReverse(Node preNode) {
        Node nextNode = this.getNext();
        this.setNext(preNode);
        if (nextNode == null) {
            return this;
        }
        return nextNode.recursiveReverse(this);
    }

    //printing
    public void printLinkedList(int length) {
        System.out.print(this.getElement() + " -> ");
        if (length > 1 && this.getNext() != null) {
            this.getNext().printLinkedList(--length);
        }
    }
}
