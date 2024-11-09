# Sort-an-array-of-0s-1s-and-2s-Dutch-National-Flag-problem
The solution you've provided implements the Dutch National Flag problem efficiently with a time complexity of O(N). This is an optimal solution, as the array is sorted in a single pass using the three-pointer approach. Below, I'll explain the approach and the code flow.

<h1>Explanation of the Approach (Dutch National Flag Problem)</h1>
The algorithm works by maintaining three pointers (low, mid, and high) to track the positions where different elements (0s, 1s, and 2s) should be placed in the array:

<h4>low:</h4> Points to the position where the next 0 should be placed.
<h4>mid: </h4>Points to the current element being considered.
<h4>high:</h4> Points to the position where the next 2 should be placed.

<h3>The idea is to:</h3>
Move all 0s to the left side.
Keep the 1s in the middle.
Move all 2s to the right side.

<h1>Algorithm Flow</h1>
<h3>Initialization:</h3>
low is initialized to 0 (start of the array).
mid is initialized to 0 (start of the array).
high is initialized to n-1 (end of the array).

<h3>While Loop:</h3>
The loop continues until mid is less than or equal to high.

<h3>Conditions:</h3>
If arr[mid] == 0:
Swap arr[low] and arr[mid], then increment both low and mid to move the pointers forward.
If arr[mid] == 1:
Simply increment mid, as 1 is already in the middle part of the array.
If arr[mid] == 2:
Swap arr[mid] and arr[high], and decrement high to move the pointer backward.

<h1>Termination:</h1>
The process stops when mid surpasses high, and the array is sorted with all 0s at the beginning, 1s in the middle, and 2s at the end.

<h1>Code Implementation</h1>
public class array_7 {
    // Function to sort the array using Dutch National Flag algorithm
    static void sort(int arr[], int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);  // Swap 0 to the low boundary
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;  // 1 is already in the correct position
            } else {
                swap(arr, mid, high);  // Swap 2 to the high boundary
                high--;
            }
        }
    }

    // Function to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to display the array
    static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int n = arr.length;
        sort(arr, n);  // Sort the array
        display(arr, n);  // Display the sorted array
    }
}
<h1>Output:</h1>
0 0 0 0 0 1 1 1 1 1 2 2

<h1>Explanation of the Code:</h1>
sort(): This is the function that sorts the array. It uses the Dutch National Flag algorithm with three pointers (low, mid, high).
swap(): A helper function that swaps two elements in the array.
display(): This function prints the sorted array.

<h1>Time Complexity:</h1>
Time Complexity: O(N), where N is the length of the array. This is because the array is traversed only once, and the operations inside the loop are constant time operations.
Space Complexity: O(1), as the sorting is done in-place with only a few extra variables (low, mid, high) being used.
This approach is optimal and works efficiently for sorting an array consisting of only 0s, 1s, and 2s.
