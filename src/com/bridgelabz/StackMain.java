package com.bridgelabz;

public class StackMain {

    public static void main(String[] args) {

        StackService list = new StackService();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.pop();
        list.peak();
        list.printList();
    }
}
