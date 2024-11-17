import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(10);
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.add(4, 9);
        linkedList.add(4, 9);
        linkedList.printList();
    }
}