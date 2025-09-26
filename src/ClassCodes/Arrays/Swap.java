package ClassCodes.Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 18, 56};

        reverse(arr);
        System.out.print(Arrays.toString(arr));

    }

    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}


