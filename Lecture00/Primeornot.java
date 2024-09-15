import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        int c = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                c++;
            }
            i++;
        }
        if (c == 1) {
            System.out.println(num + " is Co-prime");
        } else if (c == 2) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is Not prime");
        }
    }
}
