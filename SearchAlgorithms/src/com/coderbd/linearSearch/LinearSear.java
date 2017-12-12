package com.coderbd.linearSearch;

/**
 *
 * @author Rajaul Islam
 */
public class LinearSear {

    /*
    A simple approach is to do linear search, i.e

    Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
    If x matches with an element, return the index.
    If x doesn’t match with any of elements, return -1.
    
    ================Check Image at Image folder for better understanding===============
     */
    // This function returns index of element x in arr[]
    public static int runLeanerSearch(int arr[], int searchedNum) {
        for (int i = 0; i < arr.length; i++) {
            // Return the index of the element if the element is found
            if (arr[i] == searchedNum) {
                return i;
            }
        }
        // return -1 if the element is not found
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {15, 7, 8, 1, 18, 9, 5, 7, 28, 35, 66, 88, 17};
        int index = runLeanerSearch(arr, 252);
        System.out.println("Searched Index: "+index);
    }
}
