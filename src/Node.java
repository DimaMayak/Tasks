public class Node {

    private int data;
    private Node nextElement;

    public Node(int data) {
        this.data = data;
        nextElement = null;
    }

    public int getData() {
        return data;
    }

    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }

    public Node getNextElement() {
        return nextElement;
    }
}
