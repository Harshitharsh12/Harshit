import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number = sc.nextInt();
        while (sum >= 0) {
            sum += number;
            if (sum >= 0) {
                System.out.println(number);
            }
        }
    }
}
