//public class Seminar3 {
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.add(5);
//        list.add(2);
//        list.add(1);
//        list.add(8);
//        list.add(4);
//        list.add(7);
//        list.add(3);
//        list.print();
//        System.out.println(list.size);
//        list.add(3, 4, 5, 4, 8);
//        list.print();
//        list.del(5);
//        list.print();
//        System.out.println(list.size);
//
//    }
//}


//class LinkedList {
//    int size;
//    Node head;
//
//    public void add(int value) {
//        Node newNode = new Node();
//        newNode.value = value;
//        newNode.next = null;
//        newNode.previous = null;
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node currentNode = head;
//            while (currentNode.next != null) {
//                currentNode = currentNode.next;
//            }
//            currentNode.next = newNode;
//            newNode.previous = currentNode;
//        }
//        size++;
//    }
//
//    public void print() {
//
//        if (head != null) {
//            Node currentNode = head;
//            while (currentNode.next != null) {
//                System.out.print(currentNode.value + " ");
//                currentNode = currentNode.next;
//            }
//            System.out.println(currentNode.value);
//        } else {
//            System.out.println("Not elements");
//        }
//    }
//
//
//    public void add(int... arguments) {
//
//        for (int i = 0; i < arguments.length; i++) {
//            this.add(i);
//        }
//        size += arguments.length;
//    }
//
//    public void del(int value) {
//        Node currentNode = head;
//        while (true)
//        {
//            if (currentNode == null)
//            {
//                return;
//            }
//            if (currentNode.value == value)
//            {
//                if (currentNode.previous == null)
//                {
//                    head = currentNode.next;
//                    head.previous = null;
//                }
//                else if (currentNode.next == null)
//                {
//                    currentNode = null;
//                }
//                else
//                {
//                    Node prevNode = currentNode.previous;
//                    Node nextNode = currentNode.next;
//                    currentNode = null;
//                    prevNode.next = nextNode;
//                    nextNode.previous = prevNode;
//                }
//            }
//            size--;
//            return;
//        }
//    }
//    // конец
//}


//class Node {
//    int value;
//    Node next;
//    Node previous;
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}

