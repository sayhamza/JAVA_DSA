// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class CheckPalindrome {
    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    boolean isPalindrome(Node head) {
        Node slow = head, fast = head, prev_of_slow = head;
        Node midnode = null, second_half;
        boolean res = true;

        if (head != null && head.next != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                prev_of_slow = slow;
                slow = slow.next;
            }

            if (fast != null) {
                midnode = slow;
                slow = slow.next;
            }

            second_half = slow;
            prev_of_slow.next = null;
            second_half = reverse(second_half);

            res = compareLists(head, second_half);

            second_half = reverse(second_half);

            if (midnode != null) {
                prev_of_slow.next = midnode;
                midnode.next = second_half;
            } else {
                prev_of_slow.next = second_half;
            }
        }
        return res;
    }

    boolean compareLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                return false;
            }
        }

        if (temp1 == null && temp2 == null) {
            return true;
        }

        return false;
    }


        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(1);
    
            CheckPalindrome solution = new CheckPalindrome();
            boolean isPalindrome = solution.isPalindrome(head);
    
            System.out.println(isPalindrome ? "1" : "0");
        }
    }

