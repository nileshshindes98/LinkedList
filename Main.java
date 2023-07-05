package linkedlist;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the LinkedList");
        System.out.println();
        LinkedList ls = new LinkedList();
        ls.addFirstNode(56);
        ls.addFirstNode(30);
        ls.addFirstNode(70);

        ls.printNode();

    }
}
