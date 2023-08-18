package Backtracking;

public class BTonArray {
    public static void changearray(int arr[],int i,int val){

           //Base Case 
        if (i==arr.length) {
            System.out.print(arr);
            return;
        }

        //recursion
        arr[i]=val;
        changearray(arr, i+1, val+1);
        arr[i]=arr[i]-2;

     
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        changearray(arr, 2, 6);
    }

    
}
