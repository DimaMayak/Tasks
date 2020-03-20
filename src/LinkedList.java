import javax.swing.*;

public class LinkedList {

    private Node head;
    private int lengthOfList;

    public Node getHead() {
        return head;
    }


    public int getLengthOfList() {
        if (head==null){
        return lengthOfList;}
        else {
            lengthOfList++;
            head=head.getNextElement();
            getLengthOfList();
            return lengthOfList;}
    }

    public LinkedList() {
        this.lengthOfList=0;
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
