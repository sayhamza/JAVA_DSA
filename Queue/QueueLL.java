package Queue;

import java.util.*;

public class QueueLL {
    public static void main(String[] args) {

//Queue can be implemented using two methods LL or ArrayDeque


     //1  
     // Queue<Integer> q = new LinkedList<>();
     
     //2      
     Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
            
        }
    }
    
}
