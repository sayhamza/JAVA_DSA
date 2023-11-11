// https://practice.geeksforgeeks.org/problems/intersection-of-two-linked-list/1

package InterviewPrep.LinkedList;

import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class Intersection2LL {
    Node findIntersection(Node head1, Node head2) {
        HashSet<Integer> hs = new HashSet<>();
        Node n1 = head1;
        Node n2 = head2;
        Node dummy = new Node(0);
        Node result = dummy;

        while (n1 != null) {
            hs.add(n1.data);
            n1 = n1.next;
        }

        while (n2 != null) {
            if (hs.contains(n2.data)) {
                result.next = new Node(n2.data);
                result = result.next;
            }
            n2 = n2.next;
        }

        return dummy.next;
    }


        public static void main(String[] args) {
            Node head1 = new Node(9);
            head1.next = new Node(6);
            head1.next.next = new Node(4);
            head1.next.next.next = new Node(2);
            head1.next.next.next.next = new Node(3);
            head1.next.next.next.next.next = new Node(8);
    
            Node head2 = new Node(1);
            head2.next = new Node(2);
            head2.next.next = new Node(8);
            head2.next.next.next = new Node(6);
    
            Intersection2LL solution = new Intersection2LL();
            Node intersection = solution.findIntersection(head1, head2);
    
            Node current = intersection;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

