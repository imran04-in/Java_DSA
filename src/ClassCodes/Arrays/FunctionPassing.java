package ClassCodes.Arrays;

import java.util.Arrays;

public class FunctionPassing {
    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};
        System.out.print(Arrays.toString(nums));
        System.out.println();

        change(nums);
        System.out.print(Arrays.toString(nums));

    }

    private static void change(int[] nums) {
        nums[1] = 5;
    }

}
