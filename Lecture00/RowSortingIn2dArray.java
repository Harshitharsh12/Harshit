import java.util.*;

public class RowSortingIn2dArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 7, 3, 5 }, { 2, 4, 3, 1 }, { 5, 6, 3, 1 }, { 2, 4, 5, 1 } };
        for (int[] e : arr) {
            Arrays.sort(e);

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

}
