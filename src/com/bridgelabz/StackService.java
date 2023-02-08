package com.bridgelabz;

public class StackService {

    Node head;
    int count = 1;

    public void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {

        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }
}
