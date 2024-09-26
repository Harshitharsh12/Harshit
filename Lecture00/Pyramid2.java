import java.util.*;

public class Pyramid2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lines:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                if (k % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("! ");
                }

            }

            System.out.println();
        }
    }
}
