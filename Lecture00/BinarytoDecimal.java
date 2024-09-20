import java.util.*;
import java.lang.*;

public class BinarytoDecimal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        int r;
        int e;
        int result = 0;
        while (number > 0) {
            r = number % 10;
            number = number / 10;
            e = (int) Math.pow(2, i);
            result = result + (r * e);
            i++;
        }
        System.out.println(result);
    }
}