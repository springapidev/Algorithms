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
        int index = runLeanerSearch(arr, 35);
        System.out.println("Searched Index: " + index);

    }
    /*
    A linear search scans one item at a time, without jumping to any item .

    The worst case complexity is  O(n), sometimes known an O(n) search
    Time taken to search elements keep increasing as the number of elements are increased.

A binary search however, cut down your search to half as soon as you find middle of a sorted list.

    The middle element is looked to check if it is greater than or less than the value to be searched.
    Accordingly, search is done to either half of the given list

Important Differences

    Input data needs to be sorted in Binary Search and not in Linear Search
    Linear search does the sequential access whereas Binary search access data randomly.
    Time complexity of linear search -O(n) , Binary search has time complexity O(log n).
     Linear search performs equality comparisons and Binary search performs ordering comparisons

Let us look at an example to compare the two:

Linear Search to find the element “J” in a given sorted list from A-X
    
    ============== for better check Image for difference between LinearSearch and Binary Search===============
     */
}
