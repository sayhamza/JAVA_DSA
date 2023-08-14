package Queue;

public class QueueArrCircular {

    static class queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n){
            arr=new int [n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        //Add
        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            //Add 1st Element
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size; 
            arr[rear]=data;
        }

        //Remove
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int result =arr[front];

           //Last Element Delete

            if (rear==front) {
                rear=front=-1;
                
            }
            else{
                 front=(front+1)%size;
            }
            return result;
        }

        //Peek
        public static int peek(){
             if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front] ;
        }
    }
    public static void main(String[] args) {
        // queue q = new queue(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
            
        // }
    }
    
}

