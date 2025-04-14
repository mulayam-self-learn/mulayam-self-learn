package main.tools.DSA.GeneralProgramming;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int rotationNo = 3;

        int[] rotateArray = rotateArray(arr,rotationNo);
        System.out.println(Arrays.toString(rotateArray));
    }

    private static int[] rotateArray(int[] arr, int rotationNo) {
        int n=0;
        while(n<rotationNo){

            int first = arr[0];
            arr[0] = arr[arr.length-1];
            for(int i=1;i<arr.length;i++){
                int hold = arr[i];
                arr[i] = first;
                first =hold;
            }
            n++;
        }
        return arr;
    }
}
