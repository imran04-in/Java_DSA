package ClassCodes.LinearSearch;

public class Basic {
    public static void main(String[] args) {

      // Consider the array arr[] = {10, 50, 30, 70, 80, 20, 90, 40} and key = 30

        int[] arr = {10,50,30,70,80,20,90,40};
        int target = 300;
        int ans = linearSearch(arr,target);
        if (ans==-1){
            System.out.println("The element is not present.");
        }
        else {
            System.out.println("The element is present and the index is "+ ans);
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==target){
                return index;
            }

        }
        return -1;
    }
}
