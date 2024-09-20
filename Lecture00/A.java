import java.util.*;

public class A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            int Aayush = sc.nextInt();
            int Harshit = sc.nextInt();
            if (Aayush > Harshit) {
                System.out.println("Aayush");
            } else {
                System.out.println("Harshit");
            }
            i++;
        }
    }
}