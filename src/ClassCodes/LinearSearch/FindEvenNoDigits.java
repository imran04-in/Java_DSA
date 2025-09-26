package ClassCodes.LinearSearch;

public class FindEvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (even(num)){
                count++;
            }
        }
       return count;
    }

     static boolean even(int num) {
        int noOfDigits= digts(num);
        return noOfDigits %2 ==0;

    }

     static int digts(int num) {
        if (num<0){
            num = num*-1;
        }
        if (num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}
