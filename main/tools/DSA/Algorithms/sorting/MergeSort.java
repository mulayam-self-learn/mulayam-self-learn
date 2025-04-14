package main.tools.DSA.Algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 14, 3, 15, 8, 32, 20, 12, 7, 9};
        //int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given array is");
        System.out.println(Arrays.toString(arr));

        sort(arr, 0, arr.length - 1);

        System.out.println("----------------------");
        System.out.println("\nSorted array is");
        System.out.print(Arrays.toString(arr));
    }

       static void sort(int arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {

        int leftIndex = m - l + 1;
        int rifhtIndex = r - m;

        int leftSubArray[] = new int[leftIndex];
        int rightSubArray[] = new int[rifhtIndex];

        // Copy data to temp arrays
        for (int i = 0; i < leftIndex; ++i)
            leftSubArray[i] = arr[l + i];
        for (int j = 0; j < rifhtIndex; ++j)
            rightSubArray[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < leftIndex && j < rifhtIndex) {
            if (leftSubArray[i] <= rightSubArray[j]) {
                arr[k] = leftSubArray[i];
                i++;
            } else {
                arr[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < leftIndex) {
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < rifhtIndex) {
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
    }
}
