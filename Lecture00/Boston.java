import java.util.Scanner;

public class Boston {
    public static void boston(int number) {
        int temp = number;
        int i = 2;
        int m = 1;
        int sum1 = 0;
        int r;
        int sum2 = 0;
        while (!(m == temp)) {
            if (number % i == 0) {
                m = m * i;
                number = number / i;
                sum1 = sum1 + i;
                i = 1;

            } else {
                sum1 = sum1 + 0;
            }
            i++;
        }
        while (temp > 0) {
            r = temp % 10;
            temp = temp / 10;
            sum2 = sum2 + r;
        }
        if (sum2 == sum1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boston(number);

    }
}
