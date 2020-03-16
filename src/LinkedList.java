import javax.swing.*;

public class LinkedList {

    private Node head;

    public LinkedList() {
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

    public void recursionOut() {
        recursion(head);
        //try too add changes in new branch 
    }

    private void recursion(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            recursion(node.getNextElement());
        }
    }
}
