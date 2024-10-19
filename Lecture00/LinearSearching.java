import java.util.*;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Enter the Target Element:");
        int target = sc.nextInt();
        int result = search(arr, target);
        System.out.println(result);

    }

    static int search(int[] arr, int element) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }

        }
        return -1;
    }

    static int search2(int[] arr, int element) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int e : arr) {
            if (e == element) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean search3(int[] arr, int element) {
        if (arr.length == 0) {
            return false;
        }

        for (int e : arr) {
            if (e == element) {
                return true;
            }
        }
        return false;
    }
}
