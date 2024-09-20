import java.util.*;

public class ShoppingGame2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[2 * number];
        int c = 1;
        int i = 0;

        while (c <= number) {
            arr[i] = sc.nextInt();
            arr[i + 1] = sc.nextInt();
            c++;
            i = i + 2;
        }
        while (i < arr.length) {
            if (arr[i] < arr[i + 1]) {
                System.out.println("Harshit");
            } else {
                System.out.println("Aayush");

            }

            i = i + 2;
        }
    }
}