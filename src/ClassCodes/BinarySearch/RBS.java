package ClassCodes.BinarySearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int target = 5;
        System.out.println(ans(arr,target));

    }
    public static int ans(int[] nums, int target){
        int pivot = pivot(nums, target);
        if (pivot == -1){
            return binarySearch(nums,target,0, nums.length-1);
        }

        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);
    }

    public static int pivot(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
           int mid = start + (end-start)/2;
           if (mid < end && arr[mid] > arr[mid+1]){
               return mid;
           }
           if (mid > start && arr[mid] < arr[mid-1]){
               return mid -1;
           }
           if (arr[mid] <= arr[start]){
               end =mid-1;
           } else {
               start = mid+1;
           }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {

                return mid;
            }
        }
        return -1;
    }

}
