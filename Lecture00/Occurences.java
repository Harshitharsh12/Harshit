public class Occurences {
    public static void main(String[] args) {
        System.out.println(totalOccurences(new int[] { 1, 2, 3, 4, 5, 5, 8, 8, 8, 8 }, 3));
    }

    static int lowerBound(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (num == arr[mid]) {
                result = mid;
                end = mid - 1;
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

    static int totalOccurences(int[] arr, int target) {
        int total = upperBound(arr, target) - lowerBound(arr, target);
        return total;
    }
}
