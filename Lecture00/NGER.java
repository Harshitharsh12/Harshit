import java.util.*;

public class NGER {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 30, 4, 5 };
        System.out.println(Arrays.toString(maxValue(arr)));
    }

    static int[] maxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int[] maxElemetArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            maxElemetArray[i] = maxValue;
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxElemetArray;
    }

}
