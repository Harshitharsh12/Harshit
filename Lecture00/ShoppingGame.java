import java.util.*;

public class ShoppingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int c = 1;
        int i = 1;
        int j = 2;
        int Aayush2 = 0;
        int Harshit2 = 0;
        while (c <= number) {
            int Aayush = sc.nextInt();
            int Harshit = sc.nextInt();
            while (Aayush2 < Aayush && Harshit2 < Harshit) {
                Aayush2 = Aayush2 + i;
                Harshit2 = Harshit2 + j;
                i = i + 2;
                j = j + 2;

            }

            c++;
        }
        if (Aayush2 > Harshit2) {
            System.out.println("Aayush");
        } else {
            System.out.println("Harshit");
        }
    }
}