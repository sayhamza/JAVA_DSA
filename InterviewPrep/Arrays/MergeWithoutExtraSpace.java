// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

package InterviewPrep.Arrays;

class MergeWithoutExtraSpace {
    void merge(int arr1[], int arr2[], int n, int m) {
        int gap = (n + m + 1) / 2;
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < n + m) {
                if (j < n && arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                } else if (j >= n && i < n && arr1[i] > arr2[j - n]) {
                    int temp = arr1[i];
                    arr1[i] = arr2[j - n];
                    arr2[j - n] = temp;
                } else if (j >= n && i >= n && arr2[i - n] > arr2[j - n]) {
                    int temp = arr2[i - n];
                    arr2[i - n] = arr2[j - n];
                    arr2[j - n] = temp;
                }
                i++;
                j++;
            }
            if (gap == 1) {
                break;
            }
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        MergeWithoutExtraSpace solution = new MergeWithoutExtraSpace();
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {0, 2, 6, 8, 9};
        solution.merge(arr1, arr2, arr1.length, arr2.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
