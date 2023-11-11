// https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class RemoveLoopLL {
    public void removeLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (slow == fast) {
            slow = head;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            fast.next = null;
        }
    }

        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(3);
            head.next.next = new Node(4);
            head.next.next.next = head.next; // create a loop
            
            RemoveLoopLL solution = new RemoveLoopLL();
            solution.removeLoop(head);
            
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }