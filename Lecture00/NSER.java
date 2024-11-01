import java.util.*;

public class NSER {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 78, 4, 567, 44 };
        System.out.println(Arrays.toString(shotesetElement(arr)));
    }

    static int[] shotesetElement(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int[] temp = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            temp[i] = minValue;
            minValue = Math.min(arr[i], minValue);

        }
        return temp;
    }
}