// https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1

package InterviewPrep.StackAndQueue;

import java.util.Stack;

public class GetMinElmntStack {
    int minEle;
    Stack<Integer> s = new Stack<>();

    /*returns min element from stack*/
    int getMin() {
        if (s.isEmpty()) return -1;
        else return minEle;
    }

    /*returns popped element from stack*/
    int pop() {
        if (s.isEmpty()) return -1;
        int t = s.pop();
        if (t < minEle) {
            int res = minEle;
            minEle = 2 * minEle - t;
            return res;
        } else {
            return t;
        }
    }

    /*push element x into the stack*/
    void push(int x) {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            return;
        }
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }
    }
}
