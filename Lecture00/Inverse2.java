import java.util.*;

public class Inverse2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int result = 0;
        int n, n2;
        String s;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                n = Character.getNumericValue(number.charAt(i));
                n2 = 9 - n;
                if (n2 < n) {
                    result = result * 10 + n2;
                } else {
                    result = result * 10 + n;
                }
            }

        }

        System.out.println(result);

    }
}
