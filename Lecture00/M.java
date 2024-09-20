import java.util.*;
import java.lang.Math;

public class M {
    public static boolean armstrong(int number) {
        int temp = number;
        int c = 0;
        while (number > 0) {
            number = number / 10;
            c++;
        }
        number = temp;
        int r;
        int result = 0;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            result += (Math.pow(r, c));
        }
        if (result == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        for (int i = number1; i <= number2; i++) {
            if (armstrong(i) == true) {
                System.out.println(i);
            }
        }
    }
}