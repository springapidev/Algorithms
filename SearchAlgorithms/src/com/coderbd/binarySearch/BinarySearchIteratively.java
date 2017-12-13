package com.coderbd.binarySearch;

/**
 *
 * @author Rajaul Islam
 */
public class BinarySearchIteratively {
// Returns index of x if it is present in arr[], else
    // return -1

    int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x) {
                return mid;
            }

            // If x greater, ignore left half
            if (arr[mid] < x) {
                low = mid + 1;
            } // If x is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        // if we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearchIteratively ob = new BinarySearchIteratively();
        int arr[] = {20, 30, 40, 100, 400, 450, 600};
        int n = arr.length;
        int x = 400;
        int result = ob.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result + " and Value is: " + arr[result]);
        }
    }
}
