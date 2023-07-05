package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to append a node at the end of the linked list
    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    // Method to delete the first element in the linked list
    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }


    /*
    UC-4
    // Method to insert a node between two existing nodes in the linked list
    public void insertNode(int prevData, int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current != null) {
                if (current.data == prevData) {
                    Node nextNode = current.next;
                    current.next = newNode;
                    newNode.next = nextNode;
                    break;
                }
                current = current.next;
            }
        }
    }
     */

    // Method to display the linked list
    void printNode(){
        Node temp = head; //assigned value of head to temp variable of node for travel
        while(temp!=null){
            System.out.print( "("+ temp.data+")");
            temp =temp.next;
        }
    }
}


