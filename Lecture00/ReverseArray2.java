import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr) {
        for (int n = 0, m = arr.length - 1; n < m; n++, m--) {
            int temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;
        }
        return arr;
    }
}
