package main.tools.DSA.Algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6, 14, 3, 15, 8, 32, 20, 12, 7, 9};


        for(int i = 1; i < arr.length; i++){
            int j = i-1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print(Arrays.toString(arr));
    }
}
