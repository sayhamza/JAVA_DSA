// https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class DetectLoopLL {
    public boolean detectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(3);
            head.next.next = new Node(4);
            head.next.next.next = head.next; // create a loop
            
            DetectLoopLL solution = new DetectLoopLL();
            boolean hasLoop = solution.detectLoop(head);
            
            System.out.println("Has loop: " + hasLoop);
        }
    
}
