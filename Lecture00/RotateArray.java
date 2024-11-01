import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 3;
        System.out.println(Arrays.toString(rotateArray(arr, n)));
    }

    static void rightShifting(int[] arr) {
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
    }

    static int[] rotateArray(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int temp = arr[arr.length - 1];
            rightShifting(arr);
            arr[0] = temp;
        }
        return arr;
    }
}