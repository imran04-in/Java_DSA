package ClassCodes.Arrays;

public class MaxVal {
    public static void main(String[] args) {

        int [] arr=new  int[5];
       int maxval = maxRange(arr,1,4);
        System.out.println(maxval);
    }

    private static int maxRange(int[] arr, int start, int end) {

        if (start>end){
            return -1;
        }

        if (arr==null){
            return -1;
        }





        int maxval = arr[start];
        for (int i = start; i <= end ; i++) {
            if (arr[i]>maxval){
                maxval=arr[i];
            }

        }
        return maxval;
    }
}
