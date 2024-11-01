public class BinarySearchinAscendingOrder {
    public static void main(String[] args) {
        int[] arr = { 7, 90, 100, 120, 150, 400, 800 };
        int target = 400;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // if (arr[mid] < target) {
            // start = mid + 1;
            // } else if (arr[mid] > target) {
            // end = mid - 1;

            // } else {
            // return mid;
            // }
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
