import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    static void swap(int[] arr, int i, int j) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // or
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
        System.out.println("the Elements of Array are:");

        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("the Elements of Array are:");

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);

        // }
        // or
        for (int element : arr) {
            System.out.println(element);
        }
        // or
        // System.out.println(Arrays.toString(arr));
        swap(arr, 0, 2);
    }
}
