import java.util.*;

public class EvenDigtitsArray {
    public static void main(String[] args) {
        int[] arr = { -23, -567, 456, 9009, 675, 34, 785, 44, 9876, -8976 };
        // System.out.println(evenDigits(arr));
        System.out.println(evenDigits2(arr));
    }

    // static ArrayList<Integer> evenDigits(int[] arr) {
    // ArrayList<Integer> arraylist = new ArrayList<Integer>(5);
    // for (int i : arr) {
    // int element = i;
    // if (i < 0) {
    // i = i * -1;
    // }
    // int c = 0;
    // while (i > 0) {
    // i = i / 10;
    // c++;
    // }
    // if (c % 2 == 0) {
    // arraylist.add(element);
    // }
    // }
    // return arraylist;
    // }

    // or

    static ArrayList<Integer> evenDigits2(int[] arr) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>(5);
        for (int i : arr) {
            int element = i;
            if (i < 0) {
                i = i * -1;
            }
            int c = (int) (Math.log10(i) + 1);
            if (c % 2 == 0) {
                arraylist.add(element);
            }
        }
        return arraylist;
    }
}
