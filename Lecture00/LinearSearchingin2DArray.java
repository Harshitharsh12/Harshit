import java.util.*;

public class LinearSearchingin2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Searching Element:");
        int target = sc.nextInt();
        int[][] arr = { { 1, 2, 3 }, { 34, 56, 78, 90 }, { 1, 4, 3, 7, 9, 5 } };
        // int[][] arr = {};
        System.out.println(Arrays.toString(searching(arr, target)));
        System.out.println(searching2(arr, target));
    }

    static int[] searching(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] { -1, -1 };
    }

    static boolean searching2(int[][] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i[] : arr) {
            for (int j : i) {
                if (j == target) {
                    return true;
                }
            }

        }
        return false;
    }

}
