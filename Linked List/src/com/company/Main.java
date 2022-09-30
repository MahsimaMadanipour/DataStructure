package com.company;

import java.util.Scanner;

/**
 * @author Mahsima Madanipour
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Making a linked list with given length
        System.out.print("Enter length: ");
        int length = input.nextInt();
        input.nextLine();
        System.out.println("Enter " + length + " numbers(line by line): ");
        Node node = Node.setLinkedList(length);
        System.out.println("OK!");

        //Question 1
        length = node.removeSimilar(length);
        System.out.println("Question 1 (Remove Duplicates): ");
        node.printLinkedList(length);
        System.out.println();
        System.out.println("-------------------------");

        //Question 2
        System.out.print("0.Recursive or 1.NonRecursive: ");
        int option = input.nextInt();
        if(option == 1) {
            System.out.println("Question 2 (Reverse): ");
            node.reverse(node, length).printLinkedList(length);
            System.out.println();
            System.out.println("-------------------------");
        } else {
            System.out.println("Question 2 (Recursive Reverse): ");
            node.recursiveReverse(node).printLinkedList(length);
            System.out.println();
            System.out.println("-------------------------");
        }
    }
}
