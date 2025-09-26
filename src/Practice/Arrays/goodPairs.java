package Practice.Arrays;

public class goodPairs {
    public static void main(String[] args) {
        //https://leetcode.com/problems/number-of-good-pairs/description/
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
        
    }
    public static int numIdenticalPairs(int[] nums) {

        int pairs =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && nums[i] == nums[j]) {
                    pairs +=1;
                }
            }
            }
        return pairs;
        }

    }

