public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 60, 80, 90, 100 };
        int target = 110;
        System.out.println(celing(arr, target));
    }

    static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}
