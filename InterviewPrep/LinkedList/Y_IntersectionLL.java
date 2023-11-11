// https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1


package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Y_IntersectionLL {
    int intersectPoint(Node head1, Node head2) {
        int len1 = 0, len2 = 0;
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null) {
            len1++;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            len2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        if (temp1 != null) {
            return temp1.data;
        }

        return -1;
    }


        public static void main(String[] args) {
            Node common = new Node(8);
            common.next = new Node(4);
            common.next.next = new Node(5);
    
            Node head1 = new Node(4);
            head1.next = new Node(1);
            head1.next.next = common;
    
            Node head2 = new Node(5);
            head2.next = new Node(6);
            head2.next.next = new Node(1);
            head2.next.next.next = common;
            
            Y_IntersectionLL solution = new Y_IntersectionLL();
            int intersectVal = solution.intersectPoint(head1, head2);
            
            System.out.println("Intersection point value: " + intersectVal);
        }
    
}
