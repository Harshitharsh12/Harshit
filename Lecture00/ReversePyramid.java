import java.util.*;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - i; j--) {
                System.out.print("  ");
            }
            for (int k = 2 * n; k > (2 * i + 1); k--) {
                System.out.print("$ ");

            }
            System.out.println();
        }

    }
}
