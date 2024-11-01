import java.util.*;

public class RotateArray2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 5;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    static void reverse(int[] arr, int n, int m) {
        while (n < m) {
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
            n++;
            m--;
        }
    }

    static int[] rotate(int[] arr, int k) {
        // for (int c = 1; c <= k; c++) {
        // reverse(arr, 0, arr.length - 1);
        // reverse(arr, 1, arr.length - 1);
        // }
        // or
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        return arr;
    }
}