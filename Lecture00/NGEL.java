import java.util.*;
public class NGEL {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(maxValue(arr)));
    }

    static int[] maxValue(int[] arr) {
        int[] temp = new int[arr.length];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            temp[i] = maxValue;
            maxValue = Math.max(maxValue, arr[i]);
        }
        return temp;
    }
}
