import java.util.Scanner;

public class Swap {
    static void swap(int[] arr, int i, int j) {
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
        System.out.println("Enter the Length of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i = 2;
        int j = 4;
        swap(arr, i, j);
    }
}