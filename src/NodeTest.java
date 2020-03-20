import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

//    @Test
//    void Node() {
//    }
//
//    @Test
//    void getData() {
//    }
//
//    @Test
//    void setNextElement() {
//    }

    @Test
    void testGetNextElement() throws Exception {
        Node node = new Node(10);
        Node nextNode = new Node(15);
        Node thirdNode = new Node(12);
        node.setNextElement(nextNode);
        assertEquals(nextNode,node.getNextElement());
    }
}