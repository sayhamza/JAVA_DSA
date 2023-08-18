package DivideAndConquer;

public class MergeSort {

     public static void printarray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");       
        }
             System.out.println();
    }



    public static void mergsort(int arr[],int si,int ei){
        //Base Case 
        if (si>=ei) {
            return;
        }
        //Kaam
        int mid =(si+ei)/2;
        mergsort(arr, si, mid);    //Left part of array
        mergsort(arr, mid+1, ei);  //Right
        merge(arr, si,mid, ei);
    }

    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int [ei-si+1];
        int i =si;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=ei) {
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
               
            }
            else{
                temp[k]=arr[j];
                j++;
                
            }
            k++;
        }
         //Left Part
            while (i<=mid) { 
                temp[k++]=arr[i++];
            }
            
            //Right Part
            while (j<=ei) {
                temp[k++]=arr[j++];
            }
            
            //Copy Temp to Original Array
            for (k=0,i=si; k < temp.length; k++,i++) {
                arr[i]=temp[k];
            }

    }
    
    public static void main(String args[]) {
        int arr[] = { 6, 5, 12, 10, 9, 1 };
    
       mergsort(arr, 0, arr.length-1);
    
        System.out.println("Sorted array:");
        printarray(arr);
      }
    } 
    

