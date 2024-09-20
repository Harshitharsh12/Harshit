import java.util.*;

public class Input2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] arr = new int[5];
        int sum = 0;
        int j = 0;
        while (j < arr.length) {
        while (i < arr.length) {
            int number = sc.nextInt();
            arr[i] = number;
            i++;
        }
        sum = sum + arr[i];
            if (sum >= 0) {
                System.out.println(arr[i]);
                j++;
            } else {
                break;

            }
        }


    }

}