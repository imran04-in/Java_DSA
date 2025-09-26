package Practice.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class createArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/create-target-array-in-the-given-order/description/
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i],nums[i]);
        }
        int[] target = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            target[i] = targetList.get(i);
            
        }
        return target;
    }
}
