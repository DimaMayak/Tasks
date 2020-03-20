import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAddFirstElement() throws Exception{
        LinkedList list = new LinkedList();
        assertNull(list.getHead());
        Node node = new Node(10);
        list.addElement(node);
        assertEquals(node,list.getHead());

    }

    @Test
    void testAddNotFirstElement() throws Exception{
        LinkedList list = new LinkedList();
        assertNull(list.getHead());
        Node node1 = new Node(10);
        Node node2 = new Node(15);
        list.addElement(node1);
        assertEquals(node1,list.getHead());
        list.addElement(node2);
        assertEquals(node1.getNextElement(),node2);
    }

    @Test
    void out() {
    }

    @Test
    void recursionOut() {
    }
}