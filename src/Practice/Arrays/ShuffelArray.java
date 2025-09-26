package Practice.Arrays;

import java.util.Arrays;

public class ShuffelArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/shuffle-the-array/

        int[] nums ={2,5,1,3,4,7};
        int n = nums.length/2;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int even = 0;
       int[] nums1 = new int[nums.length];
        for (int i = 0; i < nums.length/2; i++) {
         nums1[even] = nums[i];
         nums1[even+1] = nums[n];
                 even += 2;
         n += 1;
        }
      return nums1;
    }
}
