public class InsertionSort {
    public void insert(int arr[], int i) {
        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
    }

    public void insertionSort(int arr[], int n) {
        for (int i = 1; i <= n - 1; i++) {
            insert(arr, i);
        }
    }

    // Method to print the array
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        InsertionSort ob = new InsertionSort();
        int arr[] = {4, 1, 3, 9, 7};
        ob.insertionSort(arr, arr.length);
        ob.printArray(arr); // Output: 1 3 4 7 9
    }
}