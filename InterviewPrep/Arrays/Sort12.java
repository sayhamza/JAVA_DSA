//Q) https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions


//"Dutch National Flag algorithm" or the "Three-Way Partitioning" algorithm.


package InterviewPrep.Arrays;

public class Sort12 {
    public static void swap(int arr[],int i,int j)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void sort012(int arr[], int n)
    {
        // code here 
       
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
       
    }
     public static void printarray(int arr[]){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");       
            }
                 System.out.println();
        }

    public static void main(String[] args) {
        int n=5;
        int arr[]= {0,2,1,2,0};
        sort012(arr, n);
        printarray(arr);
    }
        
    }
    
    

