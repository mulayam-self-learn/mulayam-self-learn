package main.tools.DSA.Algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {5, 6, 4, 2, 5, 1, 2, 2, 2,1, 1};

        for(int i=0;i< arr.length;i++){
            int min_i = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min_i] > arr[j]){
                    min_i = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i]=temp;
        }
        System.out.print(Arrays.toString(arr));
    }

}
