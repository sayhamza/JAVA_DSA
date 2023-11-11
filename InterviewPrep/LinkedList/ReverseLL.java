// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseLL {
    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            
            ReverseLL solution = new ReverseLL();
            Node reversedHead = solution.reverseList(head);
            
            Node current = reversedHead;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    
}
