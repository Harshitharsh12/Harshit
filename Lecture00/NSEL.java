import java.util.*;

public class NSEL {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 7, 99, 42, 22 };
        System.out.println(Arrays.toString(shortestElement(arr)));
    }

    static int[] shortestElement(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = minValue;
            minValue = Math.min(minValue, arr[i]);
        }
        return temp;

    }
}