package com.company;

import java.util.Scanner;

/**
 * @author Mahsima Madanipour
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //create an empty list
        List linkedList = new List(null, null, 0);

        //specify length
        System.out.print("Enter length: ");
        int length = input.nextInt();
        input.nextLine();

        //fill out the list with input elements
        System.out.println("Please enter " + length + " numbers(line by line): ");
        for(int i = 0; i < length; i++) {
            int element = input.nextInt();
            linkedList.addToLinkedList(element);
        }
        System.out.println("Ok!");

        //menu
        boolean menuController = true;
        while(menuController) {
            System.out.println("0. Remove Duplicates");
            System.out.println("1. Reverse");
            System.out.println("2. Recursive Reverse");
            System.out.println("3. Exit =)");
            System.out.print("Select your desired option: ");
            int option = input.nextInt();

            switch (option) {
                //Question 1
                case 0:
                    linkedList.removeSimilar();
                    linkedList.printLinkedList(linkedList.getHead());
                    System.out.println();
                    System.out.println("----------------------");
                    break;
                //Question 2 (NonRecursive)
                case 1:
                    linkedList.reverse();
                    linkedList.printLinkedList(linkedList.getHead());
                    System.out.println();
                    System.out.println("----------------------");
                    break;
                //Question 2 (Recursive)
                case 2:
                    linkedList.setTail(linkedList.recursiveReverse(linkedList.getHead()));
                    linkedList.printLinkedList(linkedList.getHead());
                    System.out.println();
                    System.out.println("----------------------");
                    break;
                //Exit
                case 3:
                    menuController = false;
                    System.out.println("----------------------");
                    break;
                default:
                    System.out.println("We don't have this option!!!");
                    System.out.println("----------------------");
                    break;
            }
        }

    }
}
