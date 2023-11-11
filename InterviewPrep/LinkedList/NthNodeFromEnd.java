// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class NthNodeFromEnd {
    int getNthFromLast(Node head, int n) {
        Node first = head, second = head;
        for (int i = 0; i < n; i++) {
            if (first == null) {
                return -1;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(6);
            head.next.next.next.next.next.next = new Node(7);
            head.next.next.next.next.next.next.next = new Node(8);
            head.next.next.next.next.next.next.next.next = new Node(9);
            
            NthNodeFromEnd solution = new NthNodeFromEnd();
            int nthNode = solution.getNthFromLast(head, 2);
            
            System.out.println("2nd node from end: " + nthNode);
        }
    
}
