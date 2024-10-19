import java.util.*;

public class MaxandMinElementin2DArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12 }, { 138, 14, 15, 16, 17, 18, 20 } };
        System.out.println((maxElement(arr)));
        System.out.println((maxElement2(arr)));
    }

    static int maxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];

                }

            }

        }

        return max;
    }

    // or

    static int maxElement2(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i[] : arr) {
            for (int j : i) {
                if (j > max) {
                    max = j;

                }

            }

        }

        return max;
    }

}
