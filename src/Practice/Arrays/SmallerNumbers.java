package Practice.Arrays;

import java.util.Arrays;

public class SmallerNumbers {
    public static void main(String[] args) {
        //https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
     int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
     
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {

            int[] smaller = new int[nums.length];

        for (int compareIndx = 0; compareIndx < nums.length ; compareIndx++) {
            int totalNum = 0;
            for (int i = 0; i < nums.length ; i++) {
                if (nums[compareIndx] > nums[i]){
                    totalNum += 1;
                }
            }
            smaller[compareIndx] = totalNum;

        }
        return smaller;
            
        }
    }

