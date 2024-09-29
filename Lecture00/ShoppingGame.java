import java.util.*;

public class ShoppingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[2 * number];
        int i = 0;
        while (i < arr.length) {
            arr[i] = sc.nextInt();
            i++;
        }
        int j = 0;

        while (j < arr.length) {
            int A = arr[j];
            int H = arr[j + 1];
            int A2 = 0;
            int H2 = 0;
            int m = 1;
            int n = 2;
            while (A2 <= A && H2 <= H) {
                A2 = A2 + m;
                H2 = H2 + n;
                m = m + 2;
                n = n + 2;

            }
            if (A2 > A) {
                System.out.println("Harshit");
            } else {
                System.out.println("Aayush");
            }
            j = j + 2;
        }

    }
}
