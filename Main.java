package linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList");
        System.out.println();
        LinkedList ls = new LinkedList();

        ls.appendNode(56);
        ls.appendNode(30);
        ls.appendNode(70);

        ls.popLast();

        System.out.println("LinkedList Sequence: ");
        ls.printNode();

    }
}
