import java.util.*;

public class NumbnertoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String s = Integer.toString(number);
        int r;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String s2 = String.valueOf(c);
            int number2 = Integer.parseInt(s2);
            if (number2 == 0) {
                r = 5;
                result = result * 10 + r;
            } else {
                r = number2;
                result = result * 10 + r;

            }

        }

        System.out.println(result);
    }
}
