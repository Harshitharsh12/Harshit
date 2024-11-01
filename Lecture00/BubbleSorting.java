import java.util.*;

public class BubbleSorting {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 3, 2, 7 };
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(sortedArray(arr)));
    }

    static int[] sortedArray(int[] arr) {
        for (int n = 1; n < arr.length; n++) {
            boolean swapped = false;
            for (int i = 0; i < arr.length - n; i++) {
                // Increasing Order:
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }

                // Decraesing Order:
                // if (arr[i] < arr[i + 1]) {
                // int temp = arr[i];
                // arr[i] = arr[i + 1];
                // arr[i + 1] = temp;
                // }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
