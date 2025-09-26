package ClassCodes.LinearSearch;

import java.util.Arrays;

public class SearchingIn2DArrays {
    public static void main(String[] args) {

        int[][] arr = {
                {12,13,14},
                {15,16},
                {23,75,68,94}

        };

        int target = 78;
        int ans[] = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
    }

     static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE;
         for (int row= 0; row <arr.length ; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col]>max) {
                     max = arr[row][col];

                 }

             }
             
         }
         return max;
    }

    static int[] search(int[][] arr, int target) {

         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col]==target){
                     return new int[]{row,col};
                 }

             }
         }
        return new int[]{-1,-1};
    }
}
