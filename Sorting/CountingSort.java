public class CountingSort {

    public static void CountSort(int arr[]) {
        int largest=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int [largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            
        }
        //Sorting

            int j=0;
            for (int i = 0; i < count.length; i++) {
                while (count[i]>0) {
                    arr[j]=i;
                    j++;
                    count[i]--;

                    
                }
                
            }
    }

 private static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        CountSort(arr);
        printArr(arr);

    }
}