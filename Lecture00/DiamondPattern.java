import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print((char) 6 + " ");

            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= n - i; j--) {
                System.out.print("  ");
            }
            for (int k = 2 * n; k > (2 * i + 1); k--) {
                System.out.print((char) 6 + " ");

            }
            System.out.println();

        }

    }

}
