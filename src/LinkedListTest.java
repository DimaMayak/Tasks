import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void testAddFirstElement() throws Exception {
        LinkedList list = new LinkedList();
        assertNull(list.getHead());
        Node node = new Node(10);
        list.addElement(node);
        assertEquals(node, list.getHead());

    }

    @Test
    void testTReverse() throws Exception{
        LinkedList list = new LinkedList();
        list.addElement(new Node(0));
        list.addElement(new Node(1));
        list.addElement(new Node(2));
        list.addElement(new Node(3));
        list.addElement(new Node(4));
        list.addElement(new Node(5));
        LinkedList sList = new LinkedList(list.getHead());
        list.tReverse();
        assertEquals(sList.getLengthOfList(),list.getLengthOfList());
        assertEquals(sList.getElementById(0).getData(),list.getElementById(5).getData());
        assertEquals(list.getElementById(1).getData(),4);
    }

    @Test
    void testGetElementById() throws Exception {
        LinkedList list = new LinkedList();
        list.addElement(new Node(10));
        list.addElement(new Node(11));
        list.addElement(new Node(12));
        Node node1 = new Node(13);
        list.addElement(node1);
        list.addElement(new Node(14));
        assertEquals(node1,list.getElementById(3));
    }

    @Test
    void testAddNotFirstElement() throws Exception {
        LinkedList list = new LinkedList();
        assertNull(list.getHead());
        Node node1 = new Node(10);
        Node node2 = new Node(15);
        list.addElement(node1);
        assertEquals(node1, list.getHead());
        list.addElement(node2);
        assertEquals(node1.getNextElement(), node2);
    }

    @Test
    void testReverse() throws Exception{
        LinkedList list = new LinkedList();
        list.addElement(new Node(0));
        list.addElement(new Node(1));
        list.addElement(new Node(2));
        list.addElement(new Node(3));
        LinkedList reverse = new LinkedList();
        reverse=list.reverse();
        if (list.getLengthOfList()==0){
            assertEquals(reverse.getHead(),null);
        }else if(list.getLengthOfList()==1){
            assertEquals(reverse.getHead(),list.getHead());
        }else if((list.getLengthOfList() % 2)==0 && list.getLengthOfList()!=1){
            for(int i=list.getLengthOfList()-1;i>=0;i--){
                assertEquals(reverse.getElementById(reverse.getLengthOfList()-i-1).getData(),list.getElementById(i).getData());
            }
        }else {

        }

    }

    @Test
    void testGetLenthOfList() throws Exception {
        LinkedList list = new LinkedList();
        list.addElement(new Node(10));
        list.addElement(new Node(11));
        list.addElement(new Node(12));
        list.addElement(new Node(13));
        assertEquals(4, list.getLengthOfList());
    }


}