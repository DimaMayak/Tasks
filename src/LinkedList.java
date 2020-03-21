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
//    public  Node getByIndex(){
    //
    //    }

//    private void recursion(Node node) {
//        if (node != null) {
//            System.out.println(node.getData());
//            recursion(node.getNextElement());
//        }
//    }
}
