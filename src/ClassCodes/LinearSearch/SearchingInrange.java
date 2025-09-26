package ClassCodes.LinearSearch;

public class SearchingInrange {
    public static void main(String[] args) {
        int[] arr = {12,45,96,53,95,274,25};
        int start =1;
        int end = 5;
        int target = 53;

        System.out.println(search(arr,start,end,target));
    }

     static int search(int[] arr, int start, int end, int target) {

        if (arr.length==0){
            return -1;
        }

         for (int i = start; i <= end ; i++) {
             if (arr[i]==target){
                 return i;
             }

         }


    return -1;
    }
}
