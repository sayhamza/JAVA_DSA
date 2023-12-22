
// https://www.geeksforgeeks.org/problems/maximum-value-in-a-bitonic-array3001/1?page=1&difficulty=Basic,Easy&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions


class BitonicPoint {
    // Function to find the peak element in a bitonic array
    public static int findPeak(int arr[], int n) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the peak element
            boolean isPeak = (mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1]);
            if (isPeak) {
                return arr[mid]; // Return peak element
            }

            // If not peak, adjust search range
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1; // Peak is in the left half
            } else {
                low = mid + 1; // Peak is in the right half
            }
        }
        return -1; // No peak element found
    }

    // Test the function with an example
    public static void main(String[] args) {
        int[] arr = {1, 15, 25, 45, 42, 21, 17, 12, 11};
        System.out.println(findPeak(arr, arr.length)); // Output: 45
    }
}