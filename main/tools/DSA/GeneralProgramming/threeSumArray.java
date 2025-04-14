package main.tools.DSA.GeneralProgramming;

import java.util.*;

public class threeSumArray {
    public static void main(String[] args) {
        //int[] nums = {-1,0,1,2,-1,-4};
        int[] nums = {11,10,11,12,13,14};
        int target = 35;
        List<List<Integer>> result  = threeSum(nums, target);
        for (List<Integer> list:result ) {
            System.out.println(list);
            System.out.print("");
        }
    }
    static  public List<List<Integer>> threeSum(int[] nums, int target) {


        Set<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i< nums.length;i++){
            int j=i+1;
            int k = nums.length-1;
            while (j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    resultSet.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        resultList.addAll(resultSet);
        return resultList;
    }
}
