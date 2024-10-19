public class MinElementofanArray {
    public static void main(String[] args) {
        int[] arr = { 100, 34, 24, 67, 90 };
        System.out.println(minElement(arr));
        System.out.println(maxElement(arr));
    }

    static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
