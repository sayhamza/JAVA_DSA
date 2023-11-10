// https://practice.geeksforgeeks.org/problems/circular-tour-1587115620/1


package InterviewPrep.StackAndQueue;


class Solution {
    int tour(int petrol[], int distance[]) {
        int len = petrol.length;
        int store = 0, shortage = 0, start = 0;

        for(int i = 0; i < len; i++) {
            store += petrol[i] - distance[i];
            if(store < 0) {
                shortage += store;
                store = 0;
                start = i + 1;
            }
        }

        return store + shortage >= 0 ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        Solution s = new Solution();
        int start = s.tour(petrol, distance);
        System.out.println(start == -1 ? "No solution" : "Start = " + start);
    }
}
