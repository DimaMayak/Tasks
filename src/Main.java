public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node(10);
        linkedList.addElement(node1);
        linkedList.addElement(new Node(5));
        linkedList.addElement(new Node(6));
        linkedList.addElement(new Node(7));
        linkedList.addElement(new Node(8));
        linkedList.getElementById(2);
        new LinkedList();
        LinkedList rev;
        rev = linkedList.reverse();
        rev.out();
    }
}
