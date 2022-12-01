package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeg(3);
        list.insertAtBeg(5);

        list.insertAtEnd(9);

        list.insertAt(10, 2);
        list.insertAt(99, 0);
        
        list.show();
    }
    
}
