// https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1

package InterviewPrep.LinkedList;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    public void push(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int pop() {
        if (front == null) {
            return -1;
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }


    public static void main(String[] args) {
        Queue queue = new Queue();

        int[] queries = {1, 2, 1, 3, 2, 1, 4, 2};

        for (int i = 0; i < queries.length; i++) {
            if (queries[i] == 1) {
                queue.push(queries[++i]);
            } else if (queries[i] == 2) {
                System.out.println(queue.pop());
            }
        }
    }
}

