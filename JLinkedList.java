import java.util.*;
public class JLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node () {
            next = null;
        }
        Node(int d) {
            data = d;
            next = null;
        }
    }
    JLinkedList() {
        head = new Node();
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = this.head.next;
        this.head.next = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertKey(int data, int key) {
        Node newNode = new Node(data);
        newNode.next = null;
        Node temp = this.head;
        boolean status = false;
        while(temp != null) {
            if(temp.data == key) {
                status = true;
                break;
            }
            temp = temp.next;
        }
        if(status) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else {
            System.out.println("Key Not Found");
        }
    }

    public void printList() {
        Node currNode = this.head.next;
        System.out.println("LinkedList: ");
        while(currNode != null) {
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JLinkedList ll = new JLinkedList(); 
        System.out.println("Enter No of Nodes : ");
        int n = sc.nextInt();
        System.out.println("Enter N Node Value to insert at front : ");
        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
            ll.insertFront(data);
        }
        System.out.println("Enter N Node Value to insert at End : ");
        for(int i=0;i<n;i++) {
            int data = sc.nextInt();
            ll.insertEnd(data);
        }
        System.out.println("Enter key and data : ");
        int key = sc.nextInt();
        int data = sc.nextInt();
        ll.insertKey(data, key);
        ll.printList();


        sc.close();
    }
}
