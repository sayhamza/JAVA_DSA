// https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

public class DeleteWithoutHeadPointer {
    void deleteNode(Node node) {
        Node nextNode = node.next;
        node.data = nextNode.data;
        node.next = nextNode.next;
        nextNode = null;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(4);
        head.next.next.next = new Node(30);
    
        DeleteWithoutHeadPointer solution = new DeleteWithoutHeadPointer();
        solution.deleteNode(head.next); // delete node with value 20
    
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
