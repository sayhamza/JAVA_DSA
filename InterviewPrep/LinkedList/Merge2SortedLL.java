// https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class MergeLists {
    Node sortedMerge(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        if (head1.data < head2.data) {
            head1.next = sortedMerge(head1.next, head2);
            return head1;
        } else {
            head2.next = sortedMerge(head1, head2.next);
            return head2;
        }
    }


    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        MergeLists solution = new MergeLists();
        Node merged = solution.sortedMerge(head1, head2);

        Node current = merged;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

