import javax.swing.*;

public class LinkedList {

    private Node head;
    private int lengthOfList;

    public Node getHead() {
        return head;
    }

    public int getLengthOfList() {
        return lengthOfList;
    }

    public LinkedList() {
        this.lengthOfList = 0;
    }

    public LinkedList(Node node){
        this.head=node;
        this.lengthOfList=0;
        Node current=node;
        while(current!=null){
            this.lengthOfList++;
            current=current.getNextElement();
        }
    }

    public void addElement(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNextElement() != null) {
                current = current.getNextElement();
            }
            current.setNextElement(node);
        }
        lengthOfList++;
    }

    public Node tReverse() {
        Node newHead = null;
        Node current = this.head;
        while (current!=null){
            Node next=current.getNextElement();
            current.setNextElement(newHead);
            newHead=current;
            current=next;
        }
        this.head=newHead;
        return newHead;
    }

    public LinkedList reverse() {
        LinkedList reverseList = new LinkedList();
        for (int i = lengthOfList - 1; i >= 0; i--) {

            Node elementById = getElementById(i);
            reverseList.addElement(new Node(elementById.getData()));

        }
        return reverseList;
    }

    public void out() {
        Node current = head;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                System.out.println(current.getData());
                current = current.getNextElement();
            }
        }
    }

    public Node getElementById(int i) {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else if (i > lengthOfList) {
            System.out.println("Out of list");
        } else {
            for (int j = 0; j < i; j++) {
                current = current.getNextElement();
            }

        }
        return current;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", lengthOfList=" + lengthOfList +
                '}';
    }
}
