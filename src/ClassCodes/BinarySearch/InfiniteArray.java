package ClassCodes.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        // Array and target initialization
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 170;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // Start with a range of size 2
        int start = 0;
        int end = 1;

        // Expand the range until the target lies within or end exceeds array bounds
        while (target > arr[end]) {
            int newStart = end + 1;

            // Double the box range
            end = end + (end - start + 1) * 2;

            // Ensure end does not exceed array bounds
            if (end >= arr.length) {
                end = arr.length - 1;
                break; // Exit loop when `end` reaches the array limit
            }

            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}

