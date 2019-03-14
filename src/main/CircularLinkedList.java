package main;

public class CircularLinkedList {

    private Node head;

    public static void main(String[] args) {
        System.out.println("hi");
    }

}

class Node{

    private int data;
    Node next;

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}