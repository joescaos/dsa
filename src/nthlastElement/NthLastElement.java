package nthlastElement;

public class NthLastElement {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        printList(n1);

        nthToLast(n1, 4);



    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.value+" ");
            node = node.next;
        }
    }

    public static class Node {
        private int value;
        private Node next;

        Node() {}
        Node(int value) {
            this.value = value;
        }
    }

    public static void nthToLast(Node node, int n) {
        // counter for loops
        int len = 0;
        // create a node to get the curren value of the incoming node
        Node temp = node;
        // while the node is not null
        while (temp != null) {
            // get the next element of the node
            temp = temp.next;
            // increment the counter
            len ++;
        }
        // if the value of the counter is less than the value of the element to find
        if (len < n)
            System.out.println("n value is bigger than list size");
        // creaate a node with the node as input
        temp = node;
        // iterate from the start node to the result of the counter minus the value of the element
        for (int i = 0; i < len - n; i++) {
            // get the next value of the node
            temp = temp.next;
        }
        // the the value
        System.out.println("value : " + temp.value);
    }
}
