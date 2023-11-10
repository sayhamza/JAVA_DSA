// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1

package InterviewPrep.StackAndQueue;

import java.util.Stack;

public class NxtGrtElement {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> stack = new Stack<>();
        long[] result = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        long[] arr = {1L, 3L, 2L, 4L};
        long[] result = nextLargerElement(arr, arr.length);
        for (long i : result) {
            System.out.print(i + " ");  // Outputs: 3 4 4 -1 
        }
    }
}
