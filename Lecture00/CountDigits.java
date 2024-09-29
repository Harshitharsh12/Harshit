import java.util.*;

public class CountDigits {
    public static int checkNumber(int number, int digit) {
        int c = 0;
        int r;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            if (r == digit) {
                c++;
            }
        }
        return c;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();

        System.out.println(checkNumber(number, digit));
    }
}