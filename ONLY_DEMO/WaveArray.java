// https://www.geeksforgeeks.org/problems/wave-array-1587115621/1?page=1&difficulty=Basic,Easy&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

class WaveArray {
    public static void convertToWave(int arr[], int n){
        for (int i = 0; i < n-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}