//Q) Given an array of integers heights representing the histogram's bar height where the
// width of each bar is 1, return the area of the largest rectangle in the histogram.

package Stack;

import java.util.Stack;

public class MaxAreaHistgrm {
    public static void maxarea(int arr[]){

        int maxarea=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];


        //NEXT SMALLER RIGHT
        Stack<Integer> s=new Stack<>();
        for (int i = arr.length-1; i >=0; i--) {

            //1 while
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();   
            }

            //2 if-else
            if (s.isEmpty()) {
                nsr[i]=arr.length;
            } else {
                nsr[i]=s.peek();
            }

            //3 push in s
            s.push(i);
            
        }
        //NEXT SMALLER LEFT
        s=new Stack<>();
        for (int i = 0; i <arr.length; i++) {

            //1 while
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();   
            }

            //2 if-else
            if (s.isEmpty()) {
                nsl[i]=-1;
            } else {
                nsl[i]=s.peek();
            }

            //3 push in s
            s.push(i);
            
        }
        //CURRENT AREA  [  width = j-i-1 = nsr[i]-nsl[i]-1   ] 

        for (int i = 0; i < arr.length; i++) {
            int height=arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxarea=Math.max(currArea, maxarea);
        }
        System.out.println("Max area in Histogram is = "+maxarea);
    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        maxarea(arr);
    }
    
}
