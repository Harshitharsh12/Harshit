public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 5, 9 };
        // int[] arr = { 9, 5, 3, 2, 1 };
        int[] arr = { 9, 9, 9, 9 };
        // int[] arr = {};
        int target = 9;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        String order = arr[start] < arr[end] ? "A" : "D";
        order = arr[start] == arr[end] ? "N" : order;
        if (order == "N") {
            int ans = target == arr[0] ? 0 : -1;
            return ans;
        } else if (order == "A") {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    end = mid - 1;

                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }

            }

        }
        return -1;
    }
}