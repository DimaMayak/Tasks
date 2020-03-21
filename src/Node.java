import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return data == node.data &&
                Objects.equals(nextElement, node.nextElement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, nextElement);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextElement=" + nextElement +
                '}';
    }

}
