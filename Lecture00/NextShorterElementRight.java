import java.util.Arrays;

public class NextShorterElementRight {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shorterElement(new int[] { 2, 1, 5, 6, 2, 3 })));
    }

    static int[] shorterElement(int[] arr) {
        int shorter = arr.length;
        int[] temp = new int[arr.length];
        for (int i = arr.length - 1; i > 0; i--) {
            temp[i] = shorter;
            // if (i > 0) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i - 1]) {
                    shorter = j;
                    temp[i - 1] = shorter;
                    break;
                } else {
                    shorter = arr.length;
                }
            }
            // }
        }
        return temp;
    }
}
