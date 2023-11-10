// https://practice.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1

package InterviewPrep.StackAndQueue;
import java.util.*;


class MaxAllSubArraySize_K {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (int i = k; i < n; i++) {
            res.add(arr[dq.peek()]);
            while (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.removeFirst();
            }
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res.add(arr[dq.peek()]);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k = 4;
        ArrayList<Integer> result = max_of_subarrays(arr, arr.length, k);
        System.out.println("Maximum elements of subarrays: " + result);
    }
}

