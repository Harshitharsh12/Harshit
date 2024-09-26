import java.util.Scanner;

public class LeftfacingTriangle {
    static void printLFT(int n) {
        // Left Facing Traingle:

        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= (n - i); k++)
        // System.out.print(" ");

        // for (int j = 1; j <= i; j++)

        // System.out.print("* ");

        // System.out.println();
        // }

        // or
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Inverted Left Facing Traingle:

        // for (int i = n; i >= 1; i--) {
        // for (int k = 1; k <= (n - i); k++)
        // System.out.print(" ");

        // for (int j = 1; j <= i; j++)

        // System.out.print("* ");

        // System.out.println();
        // }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printLFT(n);
    }
}
