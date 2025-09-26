package ClassCodes.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 750;
        System.out.println(orderAgnosticBS(arr,target));

    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

       boolean isAsc =arr[start] < arr[end];

       while (start <= end){

           int mid = start + (end-start)/2;

           if (target == arr[mid]){
               return mid;
           }

           if (isAsc){
               if (target > arr[mid]){
                   start = mid+1;
               } else {
                   end = mid-1;
               }

           }  else {
               if (target > arr[mid]){
                   end = mid-1;
               } else {
                   start = mid+1;
               }

           }

       }
       // element not present
        return -1;
    }
}
