public class UpperBound {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 4, 5, 5 };
        int num = 4;
        System.out.println(upperBound(arr, num));
    }

    static int upperBound(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (num == arr[mid]) {
                result = mid + 1;
                start = mid + 1;
            }
            if (num > arr[mid])
                start = mid + 1;

            if (num < arr[mid]) {
                end = mid - 1;
            }
        }
        return result;
    }

}
