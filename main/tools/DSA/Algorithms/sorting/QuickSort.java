package main.tools.DSA.Algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 2, 5, 1, 2, 2, 2,1, 1};

        qSort(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }
    static void qSort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = 1;//partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }
}
