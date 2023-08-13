// Q)The next greater element of some element x in an array is the first greater
// element that is to the right of x in the same array.

package Stack;

import java.util.Stack;

public class NxtGrtElmnt {

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtgrter[]=new int[arr.length];

        for (int i = arr.length-1; i >=0; i--) {

            //1 while
            while (!s.isEmpty()&&arr[s.peek()]<=arr[i]) {
                s.pop();   
            }

            //2 if-else
            if (s.isEmpty()) {
                nxtgrter[i]=-1;
            } else {
                nxtgrter[i]=arr[s.peek()];
            }

            //3 push in s
            s.push(i);
            
        }
        for (int i = 0; i < nxtgrter.length; i++) {
            System.out.print(nxtgrter[i]+" ");
            
        }
        System.out.println();

    }
    
}
