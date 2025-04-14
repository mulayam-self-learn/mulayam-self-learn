package main.tools.DSA.DataStructures.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunningSum {
    //input [3,1,2,10,1]
    //OutPut [3, 4, 6, 16, 17]
    public static void main(String[] args) {
        int[] runningArray = {3,1,2,10,1};
        int hold = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < runningArray.length; i++) {
            hold += runningArray[i];
            list.add(hold);
        }
        System.out.println(Arrays.toString(list.stream().mapToInt(i -> i).toArray()));
    }
}


