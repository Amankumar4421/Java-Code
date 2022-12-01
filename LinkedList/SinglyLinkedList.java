package LinkedList;

public class SinglyLinkedList {
    Node head;

    public void insertAtBeg(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(head == null)
            head = newNode;
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node temp = head;
        while(temp.next != null) {
            temp=temp.next;
        }
        temp.next = newNode;
    }

    public void insertAt(int data, int pos) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if(pos == 0)
            insertAtBeg(data);
        else {
            Node temp = head;
            for(int i=0;i<pos-1;i++)
                temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void show() {
        Node temp = head;

        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
