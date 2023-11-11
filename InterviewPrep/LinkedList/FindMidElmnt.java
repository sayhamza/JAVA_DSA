// https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class FindMidElmnt {
    int getMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            
            FindMidElmnt solution = new FindMidElmnt();
            int middle = solution.getMiddle(head);
            System.out.println("Middle element of linked list: " + middle);
        }
    }

