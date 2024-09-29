import java.util.*;

public class Inverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int size = number.length();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        int i = 0;
        while (i < size) {
            String s = String.valueOf(number.charAt(i));
            int m = Integer.parseInt(s);
            arr[i] = m;
            i++;
        }
        int j = (size - 1);
        int n = 1;
        while (j >= 0) {
            arr2[size - arr[j]] = n;
            j--;
            n++;
        }
        int k = 0;
        while (k < size) {
            System.out.print(arr2[k]);
            k++;
        }
    }
}