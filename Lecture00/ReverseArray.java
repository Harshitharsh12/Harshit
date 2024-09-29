import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Elements of Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int[] arr2 = new int[n];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[(arr2.length - 1) - i] = arr[i];
        }

        System.out.println("The Elements of Array in Reverse Order:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");

        }

    }
}