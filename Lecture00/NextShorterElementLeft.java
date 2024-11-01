import java.util.*;

public class NextShorterElementLeft {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shorterElement(new int[] { 2, 1, 5, 6, 2, 3 })));
    }

    static int[] shorterElement(int[] arr) {
        int shorter = -1;
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            temp[i] = shorter;
            // if (i < arr.length - 1) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] < arr[i + 1]) {
                    shorter = j;
                    temp[i + 1] = shorter;
                    break;
                } else {
                    shorter = -1;
                }
            }
            // }
        }
        return temp;
    }
}
