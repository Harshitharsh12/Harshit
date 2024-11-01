import java.util.*;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 4, 4, 7, 8, 8, 8, 8 };
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int bound(int[] arr, int num, boolean bound) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (num == arr[mid]) {
                result = mid;
                if (bound) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (num > arr[mid]) {
                start = mid + 1;
            }
            if (num < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }

    static int[] searchRange(int[] nums, int target) {
        return new int[] { bound(nums, target, true), bound(nums, target, false) };
    }
}