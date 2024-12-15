import java.util.*;

public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 12, 10 };
        System.out.println(maxElement(arr));
    }

    static int maxElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int max = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                max = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return max;
    }
}