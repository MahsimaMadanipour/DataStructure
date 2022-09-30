package com.company;

/**
 * @author Mahsima Madanipour
 */

public class Node {
    private int element;
    private Node next;

    //construction
    public Node(int element) {
        this.element = element;
    }

    //setters and getters: lines 13 ~ 27
    public void setElement(int element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getElement() {
        return this.element;
    }

    public Node getNext() {
        return this.next;
    }
}
