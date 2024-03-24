/*
* Sort an array of 0s, 1s and 2s | Dutch National Flag problem
Given an array A[] consisting of only 0s, 1s, and 2s. The task is to write a function that sorts the given array.
* The functions should put all 0s first, then all 1s and all 2s in last.

This problem is also the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra.
The problem is as follows:

Given N balls of colour red, white or blue arranged in a line in random order. You have to arrange all the balls
 such that the balls with the same colours are adjacent with the order of the balls, with the order of the colours being red,
 white and blue (i.e., all red coloured balls come first then the white coloured balls and then the blue coloured balls).

 Input: {0, 1, 2, 0, 1, 2}
Output: {0, 0, 1, 1, 2, 2}

Input: {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}
Output: {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2} */

/*
//firts approach with time complexity O(N^2)
public class array_7 {
    static void sort(int arr[], int n) {
        int zero = 0;
        int one = 0;
        int two = 0;
        //count number of 0,1,2
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zero++;
            else if (arr[i] == 1)
                one++;
            else
                two++;
        }
        int index = 0;
        //store each 0,1,2 in container like arr[index]
        for (int i = 1; i <= zero; i++) {
            arr[index++] =0;
        }
        for (int i = 1; i <= one; i++) {
            arr[index++] =1;
        }
        for (int i = 1; i <= two; i++) {
            arr[index++] =2;
        }
        //display the result
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
        int arr[]={0, 1, 2, 0, 1, 2};
        int n=arr.length;
        sort(arr,n);
    }
}
*/


//2nd approach with time complexity of O(N)
public class array_7 {
    static void sort(int arr[],int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,low,mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] arr, int i, int j) {
       int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    ///elements are displayed as follows
static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
   public static void main(String[] args){
    int arr[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    int n=arr.length;
    sort(arr,n);
    display(arr,n);
       }
    }