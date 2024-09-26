import java.util.Scanner;

public class RightFacingHorizontalV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j < (2 * n) + i; j++) {
                if (j < (2 * i) + n) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }
        for (int i = (n - 1); i > 0; i--) {
            for (int j = n + 1; j < (2 * n) + i; j++) {
                if (j < (2 * i) + (n - 1)) {
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }

    }
}
