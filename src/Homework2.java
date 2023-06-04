public class Homework2 {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(8);
        list.print();
        System.out.println("----");
        list.revert();
        System.out.println("----");
        list.print();
        System.out.println(list.factorial(5));


    }
}

class LinkedList {
    int size;
    Node head;

    public void add (int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        newNode.prev = null;
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.prev = currentNode;
        }
        size++;
    }

    public void print () {
        if (head != null) {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
        } else {
            System.out.println("List = null");
        }
    }

    public void revert() {
        if (head != null && head.next != null) {
            revert(head.next, head);
        }
    }

    public void revert (Node currentNode, Node previosNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previosNode;
        previosNode.next = null;
    }

    public int factorial (int n) {
        int result;
        if (n == 1) {
            return 1;
        } else {
            result = n * factorial(n-1);
            return result;
        }
    }
}

class Node {
    int value;
    Node next;
    Node prev;

}
