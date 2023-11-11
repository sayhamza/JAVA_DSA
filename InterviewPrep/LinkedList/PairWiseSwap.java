// https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class PairWiseSwap {
    public Node pairWiseSwap(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node firstNode = node;
        Node secondNode = node.next;

        firstNode.next = pairWiseSwap(secondNode.next);
        secondNode.next = firstNode;

        return secondNode;
    }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(2);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(6);
            head.next.next.next.next.next.next = new Node(7);
            head.next.next.next.next.next.next.next = new Node(8);
    
            PairWiseSwap solution = new PairWiseSwap();
            Node swapped = solution.pairWiseSwap(head);
    
            Node current = swapped;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    
}
