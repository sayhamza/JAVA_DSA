// https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class RotateLL {
    Node rotate(Node head, int k) {
        if (k == 0) return head;
        Node current = head;
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }

        if (current == null) return head;

        Node kthNode = current;

        while (current.next != null) {
            current = current.next;
        }

        current.next = head;
        head = kthNode.next;
        kthNode.next = null;

        return head;
    }

 
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            
            RotateLL solution = new RotateLL();
            Node rotatedHead = solution.rotate(head, 3);
            
            Node current = rotatedHead;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }

