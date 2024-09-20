import java.util.*;

public class Input {
    public static void input(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            if (sum >= 0) {
                System.out.println(arr[i]);
                i++;
            } else {
                break;

            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[5];
        while (i < arr.length) {
            int number = sc.nextInt();
            arr[i] = number;
            i++;
        }
        input(arr);

    }

}