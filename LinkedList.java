package linkedlist;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a node at the end of the linked list
    public void addFirstNode(int data) {
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

    // Method to display the linked list
    void printNode(){
        Node temp = head; //assigned value of head to temp variable of node for travel
        while(temp!=null){
            System.out.print( "("+ temp.data+")");
            temp =temp.next;
        }
    }
}


