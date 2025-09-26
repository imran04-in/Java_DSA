package Practice.Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/running-sum-of-1d-array/
     int[] nums ={1,2,3,4};
//        int[] newNums = runningSum( nums);
//        System.out.println(Arrays.toString(newNums));
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
//        int[] arr = new int[nums.length];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
//            nums[i]= nums[i] + sum;
//            sum += nums[i];
            nums[i] = sum + nums[i];
            sum = nums[i];
        }
             return nums;
    }
}
