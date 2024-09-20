import java.util.*;

public class Inverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String number2 = Integer.toString(number);
        int result = 0;
        int n, n2;
        String s;
        for (int i = 0; i < number2.length(); i++) {
            s = String.valueOf(number2.charAt(i));
            n = Integer.parseInt(s);
            n2 = 9 - n;
            if (n2 < n) {
                result = result * 10 + n2;
            } else {
                result = result * 10 + n;
            }
        }

        System.out.println(result);

    }
}
