package linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList");
        System.out.println();
        LinkedList ls = new LinkedList();

        ls.appendNode(56);
        ls.appendNode(70);
        // Inserting 30 between 56 and 70
        ls.insertNode(56, 30);
        System.out.println("LinkedList Sequence: ");
        ls.printNode();

    }
}
