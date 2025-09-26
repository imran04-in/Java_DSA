package ClassCodes.LinearSearch;

public class Basic2 {
    public static void main(String[] args) {

        // search the target and return true or false

        int[] arr = {12,45,87,24,9,0,75};
        int target = 240;

        System.out.println(linearSearch(arr,target));

    }

    static boolean linearSearch(int[] arr, int target) {
        for (int index = 0; index <arr.length; index++) {
            if (arr[index]==target){
                return true;
            }

        }
        return false;
    }
}
