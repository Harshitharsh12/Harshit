import java.util.*;

public class Replaceall0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        ;
        String result = "";
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            String lastDigit = String.valueOf(c);
            if (lastDigit == "0") {
                r = "5";
                result = result + r;
            } else {
                r = lastDigit;
                result = result + r;

            }
            // System.out.println(lastDigit);

        }

        System.out.println(result);
    }
}
