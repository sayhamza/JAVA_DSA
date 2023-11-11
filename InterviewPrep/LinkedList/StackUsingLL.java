// https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class StackUsingLL {
    Node top;

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int item = top.data;
        top = top.next;
        return item;
    }


        public static void main(String[] args) {
            StackUsingLL stack = new StackUsingLL();
    
            stack.push(2);
            stack.push(3);
            System.out.println(stack.pop());
            stack.push(4);
            System.out.println(stack.pop());
        }
    
}
