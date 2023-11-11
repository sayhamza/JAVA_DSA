// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1


package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class ReverseLLGroups {
    public Node reverse(Node node, int k) {
        Node current = node;
        Node next = null;
        Node prev = null;
        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            node.next = reverse(next, k);
        }

        return prev;
    }


   
        public static void main(String[] args) {
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            
            ReverseLLGroups solution = new ReverseLLGroups();
            Node reversedHead = solution.reverse(head, 2);
            
            Node current = reversedHead;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    
}
