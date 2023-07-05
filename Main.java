package linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList");
        System.out.println();
        LinkedList ls = new LinkedList();
        // Adding nodes in reverse order to get the desired sequence
        ls.addFirstNode(70);
        ls.addFirstNode(30);
        ls.addFirstNode(56);
        System.out.println("LinkedList Sequence: ");
        ls.printNode();

    }
}
