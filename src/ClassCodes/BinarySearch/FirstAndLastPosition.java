package ClassCodes.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
      int[] nums ={5,7,7,8,8,10};
      int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        ans[0] = findOccurence(nums,target,true);
        ans[1] = findOccurence(nums, target,false);

        return ans;
    }
    static  int findOccurence (int[] nums, int target, boolean firstOccurence){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (target == nums[mid]){
                ans = mid;
                if(firstOccurence){
                    end = mid-1;
                } else {
                   start = mid+1;
                }
            }

            if (target < nums[mid]){
                end = mid -1;
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}
