import java.util.Scanner;

public class Reverse {
    static int reverse(int n) {
        int r;
        int reverse = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            reverse = reverse * 10 + r;

        }
        return reverse;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
    }
}
